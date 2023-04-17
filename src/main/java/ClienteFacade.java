public class ClienteFacade {

    public static boolean verificarTipoGarantia(Cliente cliente) {
        if (Caucao.getInstancia().verificarComprovacaoGarantia(cliente)) {
            return false;
        }
        if (Fiador.getInstancia().verificarComprovacaoGarantia(cliente)) {
            return false;
        }
        if (Seguro.getInstancia().verificarComprovacaoGarantia(cliente)) {
            return false;
        }
        return true;
    }

}
