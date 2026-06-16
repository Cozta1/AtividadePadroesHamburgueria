package test.java;

import main.java.cardapio.ComboMenu;
import main.java.cardapio.ItemSimples;
import main.java.lanche.FabricaComumBoi;
import main.java.lanche.HamburguerBasico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboMenuTest {

    @Test
    void comboSomaPrecoEListaItens() {
        ComboMenu combo = new ComboMenu("X-Tudo")
                .adicionar(new ItemSimples("Hamburguer", 15f))
                .adicionar(new ItemSimples("Batata", 8f))
                .adicionar(new ItemSimples("Refri", 6f));

        assertEquals(29f, combo.getPreco());
        assertEquals("X-Tudo[Hamburguer, Batata, Refri]", combo.getDescricao());
    }

    @Test
    void comboAninhadoSomaTudoRecursivamente() {
        ComboMenu xTudo = new ComboMenu("X-Tudo")
                .adicionar(new ItemSimples("Hamburguer", 15f))
                .adicionar(new ItemSimples("Batata", 8f))
                .adicionar(new ItemSimples("Refri", 6f));

        ComboMenu familia = new ComboMenu("Familia")
                .adicionar(xTudo)
                .adicionar(new ItemSimples("Sobremesa", 10f));

        assertEquals(39f, familia.getPreco());
        assertEquals("Familia[X-Tudo[Hamburguer, Batata, Refri], Sobremesa]", familia.getDescricao());
    }

    // Integracao: um item pode ser criado a partir de qualquer Hamburguer do sistema.
    @Test
    void itemSimplesAPartirDeHamburguer() {
        ItemSimples item = new ItemSimples(new HamburguerBasico(new FabricaComumBoi()));

        assertEquals(10f, item.getPreco());
        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum", item.getDescricao());
    }
}
