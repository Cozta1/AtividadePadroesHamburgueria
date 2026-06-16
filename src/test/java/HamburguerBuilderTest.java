package test.java;

import main.java.lanche.Hamburguer;
import main.java.lanche.HamburguerBuilder;
import main.java.lanche.HamburguerPersonalizado;
import main.java.lanche.Bacon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerBuilderTest {

    @Test
    void deveLancarExcecaoSemTamanho() {
        try {
            new HamburguerBuilder().setPao("Brioche").build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tamanho do hamburguer e obrigatorio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSemPao() {
        try {
            new HamburguerBuilder().setTamanho("Duplo").build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de pao e obrigatorio", e.getMessage());
        }
    }

    @Test
    void deveConstruirHamburguerComExtras() {
        HamburguerPersonalizado h = new HamburguerBuilder()
                .setTamanho("Duplo")
                .setPao("Brioche")
                .setCarne("Carne de Boi")
                .comBacon()
                .comQueijo()
                .build();

        assertEquals("Hamburguer Duplo no pao Brioche (Carne de Boi) + bacon + queijo", h.getNome());
        assertEquals(25.5f, h.getValor());
    }

    @Test
    void deveConstruirHamburguerSimplesSemExtras() {
        HamburguerPersonalizado h = new HamburguerBuilder()
                .setTamanho("Simples")
                .setPao("Comum")
                .build();

        assertEquals("Hamburguer Simples no pao Comum (Carne de Boi)", h.getNome());
        assertEquals(12.0f, h.getValor());
    }

    // Integracao: o produto do builder e um Hamburguer, entao pode ser decorado.
    @Test
    void produtoDoBuilderPodeSerDecorado() {
        Hamburguer h = new HamburguerBuilder().setTamanho("Simples").setPao("Comum").build();
        Hamburguer comBacon = new Bacon(h);

        assertEquals(17.0f, comBacon.getValor());
        assertEquals("Hamburguer Simples no pao Comum (Carne de Boi) + Bacon extra", comBacon.getNome());
    }
}
