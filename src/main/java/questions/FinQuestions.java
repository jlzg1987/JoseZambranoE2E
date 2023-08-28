package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.FinalPage.BOTON_FINAL;

public class FinQuestions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_FINAL)

        );
    }
    public static FinQuestions fin() {
        return instrumented(FinQuestions.class);
    }
}
