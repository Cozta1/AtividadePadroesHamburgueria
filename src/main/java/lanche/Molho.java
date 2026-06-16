package main.java.lanche;

import main.java.lanche.Hamburguer;
import main.java.lanche.HamburguerDecorator;

public class Molho extends HamburguerDecorator {
    public Molho(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getValorExtra(){
        return 2.0f;
    }

    public String getNomeExtra(){
        return "Molho extra";
    }
}
