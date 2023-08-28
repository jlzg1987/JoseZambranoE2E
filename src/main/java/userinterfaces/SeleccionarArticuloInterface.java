package userinterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static tasks.SelecionarArtiguloTask.LINK_ARTICULO;

public class SeleccionarArticuloInterface implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_ARTICULO)
        );
    }
    public static Performable conArticulo() {
        return instrumented(SeleccionarArticuloInterface.class );
    }
}
