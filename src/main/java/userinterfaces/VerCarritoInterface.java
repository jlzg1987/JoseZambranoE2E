package userinterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static tasks.VerCarritoTask.*;


public class VerCarritoInterface implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ABRIR_CARRITO),
                Click.on(BOTON_COMPRAR)
        );
    }
    public static VerCarritoInterface VerCarro() {
        return instrumented(VerCarritoInterface.class);
    }
}
