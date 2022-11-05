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
    public void testQueueSingle() {
        LinkedList<Paciente> list = new LinkedList<Paciente>();
        Paciente paciente = new Paciente("nome", 69);
        list.add(paciente);
        assertEquals(list.remove(), paciente);
    }

    @Test
    public void testQueueMulti() {
        LinkedList<Paciente> list = new LinkedList<Paciente>();
        Paciente paciente1 = new Paciente("nome1", 1);
        Paciente paciente2 = new Paciente("nome2", 2);
        Paciente paciente3 = new Paciente("nome3", 3);
        list.add(paciente1);
        list.add(paciente2);
        list.add(paciente3);
        assertEquals(list.remove(), paciente1);
        assertEquals(list.remove(), paciente2);
        assertEquals(list.remove(), paciente3);
    }

    @Test
    public void testQueueMultiUnordered() {
        LinkedList<Paciente> list = new LinkedList<Paciente>();
        Paciente paciente1 = new Paciente("nome1", 1);
        Paciente paciente2 = new Paciente("nome2", 2);
        Paciente paciente3 = new Paciente("nome3", 3);
        list.add(paciente1);
        list.add(paciente3);
        list.add(paciente2);
        assertEquals(paciente1, list.remove());
        assertEquals(paciente2, list.remove());
        assertEquals(paciente3, list.remove());
    }

    @Test
    public void testQueueMultiColision() {
        LinkedList<Paciente> list = new LinkedList<Paciente>();
        Paciente paciente1 = new Paciente("nome1", 1);
        Paciente paciente2 = new Paciente("nome2", 1);
        Paciente paciente3 = new Paciente("nome3", 1);
        list.add(paciente1);
        list.add(paciente2);
        list.add(paciente3);
        assertEquals(paciente1, list.remove());
        assertEquals(paciente2, list.remove());
        assertEquals(paciente3, list.remove());
    }

    @Test
    public void testQueueMultiColisionUnordered() {
        LinkedList<Paciente> list = new LinkedList<Paciente>();
        Paciente paciente1 = new Paciente("nome1", 1);
        Paciente paciente2 = new Paciente("nome2", 1);
        Paciente paciente3 = new Paciente("nome3", 5);
        Paciente paciente4 = new Paciente("nome4", 2);
        Paciente paciente5 = new Paciente("nome5", 1);
        list.add(paciente1);
        list.add(paciente2);
        list.add(paciente3);
        list.add(paciente4);
        list.add(paciente5);
        assertEquals(paciente1, list.remove());
        assertEquals(paciente2, list.remove());
        assertEquals(paciente5, list.remove());
        assertEquals(paciente4, list.remove());
        assertEquals(paciente3, list.remove());
    }
}
