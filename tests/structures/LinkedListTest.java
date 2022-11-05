package structures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

import paciente.Paciente;
import structures.LinkedList;

public class LinkedListTest {
    @Test
    public void testAddToEnd() {
        LinkedList<Paciente> list = new LinkedList<Paciente>();
        Paciente paciente = new Paciente("nome", 69);
        list.addToEnd(paciente);
        assertEquals(list.getFirst(), paciente);
    }

    @Test
    public void testQueue() {
        LinkedList<Paciente> list = new LinkedList<Paciente>();
        Paciente paciente = new Paciente("nome", 69);
        list.add(paciente);
        assertEquals(list.remove(), paciente);
    }
}
