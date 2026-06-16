package main.java.lanche;

import main.java.lanche.Carne;
import main.java.lanche.CarneFrango;
import main.java.lanche.CarneFrango;
import main.java.lanche.Pao;
import main.java.lanche.PaoIntegral;

public class FabricaIntegralFrango implements FabricaAbstrata {

    @Override
    public Pao criarPao() {
        return new PaoIntegral();
    }

    @Override
    public Carne criarCarne() {
        return new CarneFrango();
    }
}
