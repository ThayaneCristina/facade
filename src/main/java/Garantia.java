import java.util.ArrayList;
import java.util.List;

public abstract class Garantia {

    private List<Cliente> formaGarantia = new ArrayList<Cliente>();

    public void addFormaGarantia(Cliente cliente) {
        this.formaGarantia.add(cliente);
    }

    public boolean verificarComprovacaoGarantia(Cliente cliente) {
        return this.formaGarantia.contains(cliente);
    }

}
