package userinterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static tasks.AñadirCarritoTask.*;

public class AñadirCarritoInterface implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR),
                Click.on(BOTON_ALERT)

        );
    }
    public static  AñadirCarritoInterface onAñadir() {
        return instrumented( AñadirCarritoInterface.class);
    }
}
