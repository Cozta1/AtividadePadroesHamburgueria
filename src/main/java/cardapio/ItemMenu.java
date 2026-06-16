package main.java.cardapio;

public abstract class ItemMenu {

    private String nome;

    public ItemMenu(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract float getPreco();

    public abstract String getDescricao();
}
