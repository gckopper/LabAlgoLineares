package structures;

public class List<T> {
    private static final int PADRAO = 20;
    private T[] lista;

    public List() {
        this(PADRAO);
    }

    @SuppressWarnings("unchecked")
    public List(int tamanho) {
        this.lista = (T[]) new Object[tamanho];
    }

    public T[] getLista() {
        return lista;
    }

    public boolean adicionaItem(T novo) {
        return trocaItem(novo, null);
    }

    public boolean removeItem(T remover) {
        return trocaItem(null, remover);
    }

    private boolean trocaItem(T novo, T velho) {
        if (lista == null) {
            return false;
        }
        int posicao = pesquisa(velho);
        if (posicao != -1) {
            lista[posicao] = novo;
            return true;
        }
        return false;
    }

    public boolean adicionaPosicao(T novo, int posicao) {
        if (!validaPosicao(posicao) || lista == null) {
            return false;
        }
        lista[posicao] = novo;
        return true;
    }

    public boolean removePosicao(int posicao) {
        return adicionaPosicao(null, posicao);
    }

    private boolean validaPosicao(int posicao) {
        return posicao >= 0 && posicao < lista.length;
    }

    public boolean listaCheia() {
        if (lista == null) {
            return true;
        }
        return pesquisa(null) == -1;
    }

    public int pesquisa(T item) {
        int posicao = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == item) {
                return i;
            }
        }
        return posicao;
    }

    public String toString() {
        StringBuilder stringObject = new StringBuilder();
        stringObject.append("[");
        for (T t : lista) {
            if (t == null) {
                continue;
            }
            stringObject.append(t.toString());
            stringObject.append(", ");
        }
        int ultimo = stringObject.lastIndexOf(", ");
        if (ultimo != -1) {
            stringObject.replace(ultimo, ultimo+1, "]");
        } else {
            stringObject.append("]");
        }
        return stringObject.toString();
    }
}