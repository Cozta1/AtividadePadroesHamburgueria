package test.java;

import main.java.lanche.LanchePrototipo;
import main.java.lanche.Receita;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanchePrototipoTest {

    @Test
    void deveClonarComCopiaProfundaDaReceita() throws CloneNotSupportedException {
        Receita receitaOriginal = new Receita("Pao Brioche", "Ao Ponto");
        LanchePrototipo original = new LanchePrototipo(1, "X-Bacon", 35.5, receitaOriginal);

        LanchePrototipo clone = original.clone();
        clone.setIdPedido(2);
        clone.getReceita().setTipoPao("Pao Australiano");
        clone.getReceita().setPontoCarne("Bem Passada");

        assertEquals(
                "LanchePrototipo{idPedido=1, nomeLanche='X-Bacon', preco=35.5, receita=Receita{tipoPao='Pao Brioche', pontoCarne='Ao Ponto'}}",
                original.toString()
        );
        assertEquals(
                "LanchePrototipo{idPedido=2, nomeLanche='X-Bacon', preco=35.5, receita=Receita{tipoPao='Pao Australiano', pontoCarne='Bem Passada'}}",
                clone.toString()
        );
    }

    @Test
    void cloneDeveSerInstanciaDiferente() throws CloneNotSupportedException {
        LanchePrototipo original = new LanchePrototipo(1, "X-Salada", 20.0, new Receita("Integral", "Ao Ponto"));
        LanchePrototipo clone = original.clone();

        assertNotSame(original, clone);
        assertNotSame(original.getReceita(), clone.getReceita());
    }
}
