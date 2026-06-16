package main.java.lanche;

import main.java.lanche.Hamburguer;

public class HamburguerPersonalizado implements Hamburguer {

    private String tamanho;
    private String pao;
    private String carne;
    private boolean bacon;
    private boolean queijo;

    public HamburguerPersonalizado(String tamanho, String pao, String carne, boolean bacon, boolean queijo) {
        this.tamanho = tamanho;
        this.pao = pao;
        this.carne = carne;
        this.bacon = bacon;
        this.queijo = queijo;
    }

    @Override
    public float getValor() {
        float valor = "Duplo".equals(tamanho) ? 18.0f : 12.0f;
        if (bacon) {
            valor += 5.0f;
        }
        if (queijo) {
            valor += 2.5f;
        }
        return valor;
    }

    @Override
    public String getNome() {
        String nome = "Hamburguer " + tamanho + " no pao " + pao + " (" + carne + ")";
        if (bacon) {
            nome += " + bacon";
        }
        if (queijo) {
            nome += " + queijo";
        }
        return nome;
    }
}
