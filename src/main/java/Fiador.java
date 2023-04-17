public class Fiador extends Garantia {

    private static Fiador fiador = new Fiador();
    private Fiador() {};

    public static Fiador getInstancia() {
        return fiador;
    }

}
