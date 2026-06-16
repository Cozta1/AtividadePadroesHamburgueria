package main.java.lanche;

import main.java.lanche.Hamburguer;
import main.java.lanche.HamburguerDecorator;

public class Bacon extends HamburguerDecorator {
    public Bacon(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getValorExtra(){
        return 5.0f;
    }

    public String getNomeExtra(){
        return "Bacon extra";
    }
}
