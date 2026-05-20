package test.java;

import main.java.preparo.PreparoLanche;
import main.java.preparo.PreparoXFrango;
import main.java.preparo.PreparoXBacon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreparoLancheTest {

    @Test
    void xBaconSegueOEsqueletoDoPreparo() {
        PreparoLanche lanche = new PreparoXBacon();
        assertEquals(
                "Tostar pao comum | Grelhar carne de boi | Queijo, bacon e molho | finalizar e servir",
                lanche.preparar()
        );
    }

    @Test
    void xBaconTemTipoCorreto() {
        assertEquals("X-Bacon", new PreparoXBacon().getTipo());
    }

    @Test
    void xFrangoSobrescreveOHookDoPaoEOsPassos() {
        PreparoLanche lanche = new PreparoXFrango();
        assertEquals(
                "Tostar pao brioche | Grelhar file de frango | Queijo, alface e maionese | finalizar e servir",
                lanche.preparar()
        );
    }

    @Test
    void xFrangoTemTipoCorreto() {
        assertEquals("X-Frango", new PreparoXFrango().getTipo());
    }

    @Test
    void ambosSaoPreparoLancheComEsqueletoDeQuatroPassos() {
        PreparoLanche[] lanches = { new PreparoXBacon(), new PreparoXFrango() };
        for (PreparoLanche lanche : lanches) {
            assertEquals(4, lanche.preparar().split(" \\| ").length);
            assertTrue(lanche.preparar().endsWith("finalizar e servir"));
        }
    }
}
