package test.java;

import main.java.cardapio.*;
import main.java.lanche.*;
import main.java.lanche.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaTest {

    @Test
    void deveRetornarNomeComumBoi() {
        FabricaAbstrata fabrica = new FabricaComumBoi();
        HamburguerBasico hamburguer = new HamburguerBasico(fabrica);

        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum", hamburguer.getNome());
    }

    @Test
    void deveRetornarNomeIntegralFrango() {
        FabricaAbstrata fabrica = new FabricaIntegralFrango();
        HamburguerBasico hamburguer = new HamburguerBasico(fabrica);

        assertEquals("Hamburguer Basico de Carne de Frango no Pao Integral", hamburguer.getNome());
    }

    @Test
    void deveRetornarValorComumBoi() {
        FabricaAbstrata fabrica = new FabricaComumBoi();
        HamburguerBasico hamburguer = new HamburguerBasico(fabrica);

        assertEquals(10.0f, hamburguer.getValor());
    }

    @Test
    void deveRetornarValorIntegralFrango() {
        FabricaAbstrata fabrica = new FabricaIntegralFrango();
        HamburguerBasico hamburguer = new HamburguerBasico(fabrica);

        assertEquals(9.0f, hamburguer.getValor());
    }
}
