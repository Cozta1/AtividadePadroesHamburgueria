package main.java.hamburgueria;

import main.java.Hamburguer;
import main.java.hamburguerBasico.FabricaComumBoi;
import main.java.hamburguerBasico.HamburguerBasico;

public class HamburgueriaBoi extends Hamburgueria {

    @Override
    public Hamburguer criarHamburguer() {
        return new HamburguerBasico(new FabricaComumBoi());
    }
}
