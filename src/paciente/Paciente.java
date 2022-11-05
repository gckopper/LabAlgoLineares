package paciente;

import structures.Orderable;

public class Paciente implements Orderable<Paciente>{
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Paciente nome=" + nome + ", idade=" + idade;
    }

    @Override
    public boolean isSmaller(Paciente toCompare) {
        return this.idade < toCompare.idade;
    }

    @Override
    public boolean isEqual(Paciente toCompare) {
        return this.idade == toCompare.idade;
    }
    
}
