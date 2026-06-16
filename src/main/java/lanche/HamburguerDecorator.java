package main.java.lanche;

public abstract class HamburguerDecorator implements Hamburguer {
    private Hamburguer hamburguer;
    public String nome;

    public HamburguerDecorator(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public float getValor(){
        return this.hamburguer.getValor() + this.getValorExtra();
    }

    public abstract float getValorExtra();

    public abstract String getNomeExtra();

    public String getNome(){
        return this.hamburguer.getNome() + " + " + this.getNomeExtra();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
