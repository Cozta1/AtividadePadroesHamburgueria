package main.java.combo;

import main.java.Hamburguer;

public abstract class Combo {

    private Hamburguer hamburguer;
    private Bebida bebida;

    public Combo(Hamburguer hamburguer, Bebida bebida) {
        this.hamburguer = hamburguer;
        this.bebida = bebida;
    }

    public abstract String getNomeCombo();

    public abstract float getDesconto();

    public float getValor() {
        float bruto = hamburguer.getValor() + bebida.getValor();
        return bruto * (1 - getDesconto());
    }

    public String getDescricao() {
        return getNomeCombo() + ": " + hamburguer.getNome() + " + " + bebida.getNome();
    }
}
