package principal;

import paciente.Paciente;
import structures.LinkedList;
import structures.List;
import structures.PriorityQueue;

public abstract class Posto {
    private static final PriorityQueue<Paciente> PRIORITY_QUEUE = new LinkedList<Paciente>();
    private static final List<Paciente> LIST = new List<Paciente>();

    public static Paciente vacinar() {
        Paciente paciente = PRIORITY_QUEUE.remove();
        if (paciente != null)
            LIST.adicionaItem(paciente);
        return paciente;
    }

    public static String vacinadosToString() {
        return LIST.toString();
    }

    public static void adicionaPaciente(String nome, int idade) {
        PRIORITY_QUEUE.add(new Paciente(nome, idade));
    }

    public static void adicionaPaciente(Paciente paciente) {
        PRIORITY_QUEUE.add(paciente);
    }

    public static String filaToString() {
        return PRIORITY_QUEUE.toString();
    }
}
