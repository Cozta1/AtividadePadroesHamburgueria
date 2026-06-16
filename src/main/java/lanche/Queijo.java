package main.java.lanche;

import main.java.lanche.Hamburguer;
import main.java.lanche.HamburguerDecorator;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getValorExtra(){
        return 2.5f;
    }

    public String getNomeExtra(){
        return "Queijo extra";
    }
}
