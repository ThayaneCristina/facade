import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveRetornarFormaGarantiCaucaoReprovada() {
        Cliente cliente = new Cliente();
        Caucao.getInstancia().addFormaGarantia(cliente);

        assertEquals(false, cliente.alugar());
    }
    @Test
    void deveRetornarFormaGarantiCaucaoAprovada() {
        Cliente cliente = new Cliente();
        Caucao.getInstancia();

        assertEquals(true, cliente.alugar());
    }

    @Test
    void deveRetornarFormaGarantiFiadorReprovada() {
        Cliente cliente = new Cliente();
        Fiador.getInstancia().addFormaGarantia(cliente);

        assertEquals(false, cliente.alugar());
    }
    @Test
    void deveRetornarFormaGarantiFiadorAprovada() {
        Cliente cliente = new Cliente();
        Fiador.getInstancia();

        assertEquals(true, cliente.alugar());
    }

    @Test
    void deveRetornarFormaGarantiSeguroReprovada() {
        Cliente cliente = new Cliente();
        Seguro.getInstancia().addFormaGarantia(cliente);

        assertEquals(false, cliente.alugar());
    }
    @Test
    void deveRetornarFormaGarantiSeguroAprovada() {
        Cliente cliente = new Cliente();
        Seguro.getInstancia();

        assertEquals(true, cliente.alugar());
    }
}
