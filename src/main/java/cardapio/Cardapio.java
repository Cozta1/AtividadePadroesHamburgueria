package main.java.cardapio;

import main.java.lanche.Hamburguer;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private Cardapio(){};

    private static Cardapio instance = new Cardapio();

    public static Cardapio getInstance() {
        return instance;
    }

    private List<Hamburguer> hamburguers = new ArrayList<>();

    public void novo(Hamburguer hamburguer) {
        hamburguers.add(hamburguer);
    }

    public List<Hamburguer> getHamburguers() {
        return hamburguers;
    }

}
