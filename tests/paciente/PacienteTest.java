package paciente;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PacienteTest {
    @Test
    public void isBigger() {
        Paciente paciente = new Paciente("null", 69);
        Paciente paciente2 = new Paciente("null", 8);
        assertEquals(true, paciente.isBigger(paciente2));
    }
}
