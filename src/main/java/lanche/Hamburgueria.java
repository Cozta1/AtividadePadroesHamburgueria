package main.java.lanche;

import main.java.cardapio.Cardapio;
import main.java.lanche.Hamburguer;

public abstract class Hamburgueria {

    public abstract Hamburguer criarHamburguer();

    public Hamburguer fazerPedido() {
        Hamburguer hamburguer = criarHamburguer();
        Cardapio.getInstance().novo(hamburguer);
        return hamburguer;
    }
}
