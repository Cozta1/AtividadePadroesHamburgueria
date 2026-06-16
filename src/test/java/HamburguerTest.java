package test.java;

import main.java.cardapio.*;
import main.java.lanche.*;
import main.java.lanche.*;
import main.java.lanche.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarValorHamburguerBasicoComumBoi() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaComumBoi());

        assertEquals(10.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerBasicoIntegralFrango() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaIntegralFrango());

        assertEquals(9.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComumBoiComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerBasico(new FabricaComumBoi()));

        assertEquals(15.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerIntegralFrangoComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerBasico(new FabricaIntegralFrango()));

        assertEquals(14.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComumBoiComBaconEQueijo() {
        Hamburguer hamburguer = new Bacon(new Queijo(new HamburguerBasico(new FabricaComumBoi())));

        assertEquals(17.5f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerComumBoiCompleto() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(new FabricaComumBoi())))));

        assertEquals(23.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorHamburguerIntegralFrangoCompleto() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(new FabricaIntegralFrango())))));

        assertEquals(22.0f, hamburguer.getValor());
    }


    @Test
    void deveRetornarNomeHamburguerBasicoComumBoi() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaComumBoi());

        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerBasicoIntegralFrango() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaIntegralFrango());

        assertEquals("Hamburguer Basico de Carne de Frango no Pao Integral", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComumBoiComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerBasico(new FabricaComumBoi()));

        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerIntegralFrangoComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerBasico(new FabricaIntegralFrango()));

        assertEquals("Hamburguer Basico de Carne de Frango no Pao Integral + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerComumBoiCompleto() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(new FabricaComumBoi())))));

        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum + Molho extra + Salada extra + Queijo extra + Bacon extra", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeHamburguerIntegralFrangoCompleto() {
        Hamburguer hamburguer = new Bacon(new Queijo(new Salada(new Molho(new HamburguerBasico(new FabricaIntegralFrango())))));

        assertEquals("Hamburguer Basico de Carne de Frango no Pao Integral + Molho extra + Salada extra + Queijo extra + Bacon extra", hamburguer.getNome());
    }
}
