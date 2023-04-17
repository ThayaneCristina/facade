public class Cliente {

    public boolean alugar() {
        return ClienteFacade.verificarTipoGarantia(this);
    }
}
