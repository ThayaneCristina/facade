public class Caucao extends Garantia{
    private static Caucao caucao = new Caucao();

    private Caucao() {};

    public static Caucao getInstancia() {
        return caucao;
    }
}
