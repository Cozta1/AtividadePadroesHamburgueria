package test.java;

import main.java.Cardapio;
import main.java.Hamburguer;
import main.java.hamburgueria.Hamburgueria;
import main.java.hamburgueria.HamburgueriaBoi;
import main.java.hamburgueria.HamburgueriaFrango;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburgueriaTest {

    @BeforeEach
    void limpaCardapio() {
        Cardapio.getInstance().getHamburguers().clear();
    }

    @Test
    void deveCriarHamburguerBoiPelaFabrica() {
        Hamburgueria hamburgueria = new HamburgueriaBoi();
        Hamburguer hamburguer = hamburgueria.criarHamburguer();

        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum", hamburguer.getNome());
        assertEquals(10.0f, hamburguer.getValor());
    }

    @Test
    void deveCriarHamburguerFrangoPelaFabrica() {
        Hamburgueria hamburgueria = new HamburgueriaFrango();
        Hamburguer hamburguer = hamburgueria.criarHamburguer();

        assertEquals("Hamburguer Basico de Carne de Frango no Pao Integral", hamburguer.getNome());
        assertEquals(9.0f, hamburguer.getValor());
    }

    @Test
    void fazerPedidoDeveRegistrarNoCardapio() {
        Hamburgueria hamburgueria = new HamburgueriaBoi();
        hamburgueria.fazerPedido();

        assertEquals(1, Cardapio.getInstance().getHamburguers().size());
        assertEquals("Hamburguer Basico de Carne de Boi no Pao Comum",
                Cardapio.getInstance().getHamburguers().get(0).getNome());
    }

    @Test
    void fazerVariosPedidosDeDiferentesFabricas() {
        Hamburgueria boi = new HamburgueriaBoi();
        Hamburgueria frango = new HamburgueriaFrango();

        boi.fazerPedido();
        frango.fazerPedido();
        boi.fazerPedido();

        assertEquals(3, Cardapio.getInstance().getHamburguers().size());
    }
}
