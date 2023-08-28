package glues;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.FinQuestions;
import questions.FromQuestions;
import userinterfaces.AñadirCarritoInterface;
import userinterfaces.HomePage;
import userinterfaces.SeleccionarArticuloInterface;
import userinterfaces.VerCarritoInterface;

import java.util.List;
import java.util.Map;

public class glueStep {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage= new HomePage();
    @Given("un cliente accede a la web de compra")
    public void un_cliente_accede_a_la_web_de_compra() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("seleciona un articulo")
    public void seleciona_un_articulo() {
    actor.attemptsTo(
            SeleccionarArticuloInterface.conArticulo()
    );
    }

    @Then("agrego el articulo al carrito")
    public void agrego_el_articulo_al_carrito() {
        actor.attemptsTo(
                AñadirCarritoInterface.onAñadir()
        );
    }

    @Then("ver el carrito de compras")
    public void ver_el_carrito_de_compras() {
        actor.attemptsTo(
                VerCarritoInterface.VerCarro()
        );
    }

    @Given("pagar las compras del carrito")
    public void pagar_las_compras_del_carrito() {

    }

    @When("veo formulario")
    public void veo_formulario(List<Map<String, String>> formData) {
        String name = formData.get(0).get("Name");
        String country = formData.get(0).get("Country");
        String city = formData.get(0).get("city");
        String creditCard = formData.get(0).get("creditCard");
        String month = formData.get(0).get("month");
        String year = formData.get(0).get("year");

        actor.attemptsTo(
                FromQuestions.data(name, country, city, creditCard, month, year)
        );
    }

    @Then("Finalizo la compra")
    public void finalizo_la_compra() {
        actor.wasAbleTo(
                FinQuestions.fin()
        );
    }

    @Then("veo el reporte de la compra")
    public void veo_el_reporte_de_la_compra() {

    }

}
