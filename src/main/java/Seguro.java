
public class Seguro extends Garantia{

    private static Seguro seguro = new Seguro();

    private Seguro() {};
    public static Seguro getInstancia() {
        return seguro;
    }

}
