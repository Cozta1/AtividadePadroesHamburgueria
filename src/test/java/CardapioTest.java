package test.java;

import main.java.cardapio.*;
import main.java.lanche.*;
import main.java.lanche.*;
import main.java.lanche.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {

    @BeforeEach
    void limpaCardapio() {
        Cardapio.getInstance().getHamburguers().clear();
    }

    @Test
    void deveAdicionarHamburguerComumBoi() {
        Cardapio.getInstance().novo(new HamburguerBasico(new FabricaComumBoi()));

        assertEquals(1, Cardapio.getInstance().getHamburguers().size());
    }

    @Test
    void deveAdicionarHamburguerIntegralFrango() {
        Cardapio.getInstance().novo(new HamburguerBasico(new FabricaIntegralFrango()));

        assertEquals(1, Cardapio.getInstance().getHamburguers().size());
    }

    @Test
    void deveRetornarNomeHamburguerComumBoi() {
        Cardapio.getInstance().novo(new HamburguerBasico(new FabricaComumBoi()));

        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum", Cardapio.getInstance().getHamburguers().get(0).getNome());
    }

    @Test
    void deveRetornarNomeHamburguerIntegralFrango() {
        Cardapio.getInstance().novo(new HamburguerBasico(new FabricaIntegralFrango()));

        assertEquals("Hamburguer Basico de Carne de Frango no Pao Integral", Cardapio.getInstance().getHamburguers().get(0).getNome());
    }

    @Test
    void deveRetornarValorHamburguerComumBoi() {
        Cardapio.getInstance().novo(new HamburguerBasico(new FabricaComumBoi()));

        assertEquals(10.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
    }

    @Test
    void deveRetornarValorHamburguerIntegralFrango() {
        Cardapio.getInstance().novo(new HamburguerBasico(new FabricaIntegralFrango()));

        assertEquals(9.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
    }

    @Test
    void deveRetornarVariosHamburguers() {
        Cardapio.getInstance().novo(new HamburguerBasico(new FabricaComumBoi()));
        Cardapio.getInstance().novo(new HamburguerBasico(new FabricaIntegralFrango()));
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(new FabricaComumBoi())));
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(new FabricaIntegralFrango())));

        assertEquals(4, Cardapio.getInstance().getHamburguers().size());
    }

    @Test
    void deveRetornarValorHamburguerComumBoiComBacon() {
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(new FabricaComumBoi())));

        assertEquals(15.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
    }

    @Test
    void deveRetornarValorHamburguerIntegralFrangoComBacon() {
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(new FabricaIntegralFrango())));

        assertEquals(14.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
    }

    @Test
    void deveRetornarValorHamburguerComumBoiCompleto() {
        Cardapio.getInstance().novo(new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(new FabricaComumBoi()))))));

        assertEquals(23.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
    }

    @Test
    void deveRetornarValorHamburguerIntegralFrangoCompleto() {
        Cardapio.getInstance().novo(new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(new FabricaIntegralFrango()))))));

        assertEquals(22.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
    }

    @Test
    void deveRetornarNomeHamburguerComumBoiComBaconQueijoMolho() {
        Cardapio.getInstance().novo(new Molho(new Queijo(new Bacon(new HamburguerBasico(new FabricaComumBoi())))));

        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum + Bacon extra + Queijo extra + Molho extra", Cardapio.getInstance().getHamburguers().get(0).getNome());
    }

    @Test
    void deveRetornarNomeHamburguerIntegralFrangoComBaconQueijoMolho() {
        Cardapio.getInstance().novo(new Molho(new Queijo(new Bacon(new HamburguerBasico(new FabricaIntegralFrango())))));

        assertEquals("Hamburguer Basico de Carne de Frango no Pao Integral + Bacon extra + Queijo extra + Molho extra", Cardapio.getInstance().getHamburguers().get(0).getNome());
    }

    @Test
    void deveRetornarNomesVariosHamburguersNoCardapio() {
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(new FabricaComumBoi())));
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(new FabricaIntegralFrango())));

        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum + Bacon extra", Cardapio.getInstance().getHamburguers().get(0).getNome());
        assertEquals("Hamburguer Basico de Carne de Frango no Pao Integral + Bacon extra", Cardapio.getInstance().getHamburguers().get(1).getNome());
    }

    @Test
    void deveRetornarValoresVariosHamburguersNoCardapio() {
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(new FabricaComumBoi())));
        Cardapio.getInstance().novo(new Bacon(new HamburguerBasico(new FabricaIntegralFrango())));

        assertEquals(15.0f, Cardapio.getInstance().getHamburguers().get(0).getValor());
        assertEquals(14.0f, Cardapio.getInstance().getHamburguers().get(1).getValor());
    }
}
