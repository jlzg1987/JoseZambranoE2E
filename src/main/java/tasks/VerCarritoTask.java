package tasks;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class VerCarritoTask {
    public  static final Target BOTON_ABRIR_CARRITO= Target.the( "Boton abrir carrito").located(By.id("cartur']"));

    public  static final Target BOTON_COMPRAR= Target.the( "Boton comprar").locatedBy("//button[@Class=\"btn btn-success\"]']");

}
