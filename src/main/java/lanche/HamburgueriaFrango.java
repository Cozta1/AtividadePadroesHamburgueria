package main.java.lanche;

import main.java.lanche.Hamburguer;
import main.java.lanche.FabricaIntegralFrango;
import main.java.lanche.HamburguerBasico;

public class HamburgueriaFrango extends Hamburgueria {

    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerBasico(new FabricaIntegralFrango());
    }
}
