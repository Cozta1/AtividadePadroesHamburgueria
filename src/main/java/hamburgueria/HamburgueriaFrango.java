package main.java.hamburgueria;

import main.java.Hamburguer;
import main.java.hamburguerBasico.FabricaIntegralFrango;
import main.java.hamburguerBasico.HamburguerBasico;

public class HamburgueriaFrango extends Hamburgueria {

    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerBasico(new FabricaIntegralFrango());
    }
}
