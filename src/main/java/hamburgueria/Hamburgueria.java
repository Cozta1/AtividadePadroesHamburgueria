package main.java.hamburgueria;

import main.java.Cardapio;
import main.java.Hamburguer;

public abstract class Hamburgueria {

    public abstract Hamburguer criarHamburguer();

    public Hamburguer fazerPedido() {
        Hamburguer hamburguer = criarHamburguer();
        Cardapio.getInstance().novo(hamburguer);
        return hamburguer;
    }
}
