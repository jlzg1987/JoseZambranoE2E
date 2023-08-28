package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.QuestionsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FromQuestions implements Task {

    public final String name;
    public final String country;
    public final String city;
    public final String creditcard;
    public final String month;
    public final String year;

    public FromQuestions(String name, String country, String city, String creditcard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditcard = creditcard;
        this.month = month;
        this.year = year;
    }



    public static Performable data(String name, String country, String city, String creditcard, String month, String  year){
        return instrumented(FromQuestions.class, name, country, city, creditcard, month,year);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(QuestionsPage.IMP_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(QuestionsPage.IMP_NAME),
                WaitUntil.the(QuestionsPage.IMP_COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(country).into(QuestionsPage.IMP_COUNTRY),
                WaitUntil.the(QuestionsPage.IMP_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(QuestionsPage.IMP_CITY),
                WaitUntil.the(QuestionsPage.IMP_CREDIT_CARD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(creditcard).into(QuestionsPage.IMP_CREDIT_CARD),
                WaitUntil.the(QuestionsPage.IMP_MONTH, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(month).into(QuestionsPage.IMP_MONTH),
                WaitUntil.the(QuestionsPage.IMP_YEAR, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(year).into(QuestionsPage.IMP_YEAR),
                WaitUntil.the(QuestionsPage.BTN_PURCHASE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(QuestionsPage.BTN_PURCHASE)
        );
    }

}
