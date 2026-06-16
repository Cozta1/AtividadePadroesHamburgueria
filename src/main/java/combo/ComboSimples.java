package main.java.combo;

import main.java.lanche.Hamburguer;

public class ComboSimples extends Combo {

    public ComboSimples(Hamburguer hamburguer, Bebida bebida) {
        super(hamburguer, bebida);
    }

    @Override
    public String getNomeCombo() {
        return "Combo Simples";
    }

    @Override
    public float getDesconto() {
        return 0.05f;
    }
}
