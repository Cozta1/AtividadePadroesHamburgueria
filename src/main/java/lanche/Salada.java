package main.java.lanche;

import main.java.lanche.Hamburguer;
import main.java.lanche.HamburguerDecorator;

public class Salada extends HamburguerDecorator {
    public Salada(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getValorExtra(){
        return 3.5f;
    }

    public String getNomeExtra(){
        return "Salada extra";
    }
}
