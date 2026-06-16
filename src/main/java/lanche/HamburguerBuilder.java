package main.java.lanche;

public class HamburguerBuilder {

    private String tamanho = "";
    private String pao = "";
    private String carne = "Carne de Boi";
    private boolean bacon;
    private boolean queijo;

    public HamburguerBuilder setTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public HamburguerBuilder setPao(String pao) {
        this.pao = pao;
        return this;
    }

    public HamburguerBuilder setCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public HamburguerBuilder comBacon() {
        this.bacon = true;
        return this;
    }

    public HamburguerBuilder comQueijo() {
        this.queijo = true;
        return this;
    }

    public HamburguerPersonalizado build() {
        if (tamanho.isEmpty()) {
            throw new IllegalArgumentException("Tamanho do hamburguer e obrigatorio");
        }
        if (pao.isEmpty()) {
            throw new IllegalArgumentException("Tipo de pao e obrigatorio");
        }
        return new HamburguerPersonalizado(tamanho, pao, carne, bacon, queijo);
    }
}
