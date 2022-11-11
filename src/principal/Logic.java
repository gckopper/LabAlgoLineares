package principal;

import paciente.Paciente;
import structures.LinkedList;
import structures.List;
import structures.PriorityQueue;
import ui.MenuName;
import ui.UserInterface;

public abstract class Logic {
    private static final PriorityQueue<Paciente> PRIORITY_QUEUE = new LinkedList<Paciente>();
    private static final List<Paciente> LIST = new List<Paciente>();
    @MenuName("Vacinar")
    public static void vacinar(UserInterface userInterface) {
        userInterface.output("cenoura");
    }

    @MenuName("Imprime Vacinados")
    public static void imprimeVacinados(UserInterface userInterface) {
        userInterface.output("batata");
    }

}
