package tasks;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class SelecionarArtiguloTask {
    public  static final Target LINK_ARTICULO= Target.the( "Link Articulo encontrado").located(By.id("card-title"));
}
