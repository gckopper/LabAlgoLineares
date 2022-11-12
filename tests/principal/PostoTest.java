package principal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import paciente.Paciente;

public class PostoTest {
    @Test
    public void vacinar() {
        Paciente paciente = new Paciente("null", 69);
        Posto.adicionaPaciente(paciente);
        assertEquals("Começo: " + paciente.toString() + "\nFim!",Posto.filaToString());
        Posto.vacinar();
        assertEquals("Começo: Fim!",Posto.filaToString());
        assertEquals("[" + paciente.toString() + "] ",Posto.vacinadosToString());
    }

}
