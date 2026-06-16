package test.java;

import main.java.lanche.Hamburguer;
import main.java.combo.*;
import main.java.lanche.Bacon;
import main.java.lanche.FabricaComumBoi;
import main.java.lanche.FabricaIntegralFrango;
import main.java.lanche.HamburguerBasico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboTest {

    @Test
    void comboSimplesBoiComRefrigerante() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaComumBoi());
        Combo combo = new ComboSimples(hamburguer, new Refrigerante());

        // (10 + 6) * 0.95 = 15.2
        assertEquals(15.2f, combo.getValor(), 0.001f);
        assertEquals("Combo Simples: Hamburguer Basico de Carne de Boi no Pao Comum + Refrigerante",
                combo.getDescricao());
    }

    @Test
    void comboFamiliaBoiComRefrigerante() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaComumBoi());
        Combo combo = new ComboFamilia(hamburguer, new Refrigerante());

        // (10 + 6) * 0.85 = 13.6
        assertEquals(13.6f, combo.getValor(), 0.001f);
        assertEquals("Combo Familia: Hamburguer Basico de Carne de Boi no Pao Comum + Refrigerante",
                combo.getDescricao());
    }

    @Test
    void comboFamiliaBoiComSuco() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaComumBoi());
        Combo combo = new ComboFamilia(hamburguer, new Suco());

        // (10 + 8) * 0.85 = 15.3
        assertEquals(15.3f, combo.getValor(), 0.001f);
        assertEquals("Combo Familia: Hamburguer Basico de Carne de Boi no Pao Comum + Suco Natural",
                combo.getDescricao());
    }

    @Test
    void comboSimplesFrangoComSuco() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaIntegralFrango());
        Combo combo = new ComboSimples(hamburguer, new Suco());

        // (9 + 8) * 0.95 = 16.15
        assertEquals(16.15f, combo.getValor(), 0.001f);
    }

    @Test
    void comboComHamburguerDecoradoComBacon() {
        Hamburguer hamburguer = new Bacon(new HamburguerBasico(new FabricaComumBoi()));
        Combo combo = new ComboSimples(hamburguer, new Refrigerante());

        // Bacon(10) = 15; (15 + 6) * 0.95 = 19.95
        assertEquals(19.95f, combo.getValor(), 0.001f);
        assertEquals("Combo Simples: Hamburguer Basico de Carne de Boi no Pao Comum + Bacon extra + Refrigerante",
                combo.getDescricao());
    }

    @Test
    void bridgePermiteVariarBebidaSemMudarCombo() {
        Hamburguer hamburguer = new HamburguerBasico(new FabricaComumBoi());

        Combo comRefri = new ComboSimples(hamburguer, new Refrigerante());
        Combo comSuco = new ComboSimples(hamburguer, new Suco());

        assertNotEquals(comRefri.getValor(), comSuco.getValor());
        assertEquals(comRefri.getNomeCombo(), comSuco.getNomeCombo());
    }
}
