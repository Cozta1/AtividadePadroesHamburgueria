package main.java.lanche;

import main.java.lanche.Carne;
import main.java.lanche.CarneBoi;
import main.java.lanche.Pao;
import main.java.lanche.PaoComum;

public class FabricaComumBoi implements FabricaAbstrata {

    @Override
    public Pao criarPao() {
        return new PaoComum();
    }

    @Override
    public Carne criarCarne() {
        return new CarneBoi();
    }
}
