package userinterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class QuestionsPage {
    public  static  final Target IMP_NAME = Target.the("Input Name").located(By.id("//*[@id='name']*"));

    public  static  final Target IMP_COUNTRY = Target.the("Input Country").located(By.id("//*[@id='country']*"));
    public  static  final Target IMP_CITY = Target.the("Input City").located(By.id("//*[@id='city']*"));
    public  static  final Target IMP_CREDIT_CARD = Target.the("Input Credit card").located(By.id("//*[@id='card']*"));
    public  static  final Target IMP_MONTH = Target.the("Input Month").located(By.id("//*[@id='month']*"));
    public  static  final Target IMP_YEAR = Target.the("Input Year").located(By.id("//*[@id='year']*"));
    public  static  final Target BTN_PURCHASE = Target.the("Input Purchase").located(By.id("//*[@id='button-Purchase']*"));
}

