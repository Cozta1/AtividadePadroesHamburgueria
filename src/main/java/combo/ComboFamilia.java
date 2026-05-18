package main.java.combo;

import main.java.Hamburguer;

public class ComboFamilia extends Combo {

    public ComboFamilia(Hamburguer hamburguer, Bebida bebida) {
        super(hamburguer, bebida);
    }

    @Override
    public String getNomeCombo() {
        return "Combo Familia";
    }

    @Override
    public float getDesconto() {
        return 0.15f;
    }
}
