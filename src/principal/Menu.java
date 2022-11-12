package principal;

import paciente.Paciente;
import ui.MenuName;
import ui.UserInterface;

public abstract class Menu {
    @MenuName("Vacinar")
    public static void vacinar(UserInterface userInterface) {
        Paciente paciente = Posto.vacinar();
        if (paciente == null) {
            userInterface.output("Nenhum paciente foi vacinado. A fila está vazia");
            return;
        }
        userInterface.output("O paciente " + paciente.getNome() + " foi vacinado");
    }

    @MenuName("Imprime Vacinados")
    public static void imprimeVacinados(UserInterface userInterface) {
        userInterface.output(Posto.vacinadosToString());
    }

    @MenuName("Adicionar paciente para vacinação")
    public static void adicionaPaciente(UserInterface userInterface) {
        String nome = userInterface.question("Qual o nome do paciente? ");
        int idade = userInterface.question("Qual a idade do paciente? ", Integer.MAX_VALUE, 0);
        Posto.adicionaPaciente(nome, idade);
        userInterface.output("Paciente adicionado");
    }

    @MenuName("Imprime fila de vacinação")
    public static void imprimeFila(UserInterface userInterface) {
        userInterface.output(Posto.filaToString());
    }
}
