package main.java.lanche;

import main.java.lanche.Carne;
import main.java.lanche.Pao;

public interface FabricaAbstrata {
    Pao criarPao();
    Carne criarCarne();
}
