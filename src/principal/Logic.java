package principal;

import paciente.Paciente;
import structures.LinkedList;
import structures.List;
import structures.PriorityQueue;
import ui.MenuName;
import ui.TUI;
import ui.UserInterface;

public abstract class Logic {
    private static final UserInterface USER_INTERFACE = new TUI();
    private static final PriorityQueue<Paciente> PRIORITY_QUEUE = new LinkedList<Paciente>();
    private static final List<Paciente> LIST = new List<Paciente>();
    @MenuName("Vacinar")
    public static void vacinar() {
        USER_INTERFACE.output("cenoura");
    }

    @MenuName("Imprime Vacinados")
    public static void imprimeVacinados() {
        USER_INTERFACE.output("batata");
    }

}
