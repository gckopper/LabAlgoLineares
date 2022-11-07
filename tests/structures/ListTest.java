package structures;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ListTest {
    @Test
    public void testaAdicao() {
        List<String> lista = new List<String>(3);
        String[] array = {"batata", null, null};
        lista.adicionaItem("batata");
        assertArrayEquals(array, lista.getLista());
    }

    @Test
    public void testaAdicaoPosicao() {
        List<String> lista = new List<String>(3);
        String[] array = {null, "pao", null};
        lista.adicionaPosicao("pao", 1);
        assertArrayEquals(array, lista.getLista());
    }

    @Test
    public void testaListaCheia() {
        List<String> lista = new List<String>(3);
        lista.adicionaItem("pao");
        lista.adicionaItem("batata");
        lista.adicionaItem("arroz");
        assertEquals(true, lista.listaCheia());
    }

    @Test
    public void testaListaNaoCheia() {
        List<String> lista = new List<String>(3);
        lista.adicionaItem("pao");
        lista.adicionaItem("batata");
        assertEquals(false, lista.listaCheia());
    }

    @Test
    public void testaListaVazia() {
        List<String> lista = new List<String>(3);
        assertEquals(false, lista.listaCheia());
    }
}
