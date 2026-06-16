package test.java;

import main.java.acesso.BD;
import main.java.acesso.Funcionario;
import main.java.acesso.HamburguerProxy;
import main.java.acesso.HamburguerReal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerProxyTest {

    @BeforeEach
    void setUp() {
        BD.addHamburguer(new HamburguerReal(1, "X-Bacon", "Pao, hamburguer, bacon e queijo",
                "Molho especial da casa", "Tempero secreto do chef"));
        BD.addHamburguer(new HamburguerReal(2, "X-Salada", "Pao, hamburguer, alface e tomate",
                "Maionese artesanal", "Pimenta da casa"));
    }

    @Test
    void deveRetornarDadosPublicos() {
        HamburguerProxy h = new HamburguerProxy(1);
        assertEquals(Arrays.asList("X-Bacon", "Pao, hamburguer, bacon e queijo"),
                h.obterDadosPublicos());
    }

    @Test
    void gerenteDeveAcessarReceitaSecreta() {
        Funcionario gerente = new Funcionario("Ana", true);
        HamburguerProxy h = new HamburguerProxy(2);
        assertEquals(Arrays.asList("Maionese artesanal", "Pimenta da casa"),
                h.obterReceitaSecreta(gerente));
    }

    @Test
    void naoGerenteNaoDeveAcessarReceitaSecreta() {
        try {
            Funcionario comum = new Funcionario("Joana", false);
            new HamburguerProxy(2).obterReceitaSecreta(comum);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Funcionario nao autorizado", e.getMessage());
        }
    }
}
