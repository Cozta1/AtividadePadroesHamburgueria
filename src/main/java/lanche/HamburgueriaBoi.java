package main.java.lanche;

import main.java.lanche.Hamburguer;
import main.java.lanche.FabricaComumBoi;
import main.java.lanche.HamburguerBasico;

public class HamburgueriaBoi extends Hamburgueria {

    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerBasico(new FabricaComumBoi());
    }
}
