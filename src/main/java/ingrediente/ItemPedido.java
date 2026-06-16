package main.java.ingrediente;

public class ItemPedido {

    private int quantidade;
    private Ingrediente ingrediente;

    public ItemPedido(int quantidade, Ingrediente ingrediente) {
        this.quantidade = quantidade;
        this.ingrediente = ingrediente;
    }

    public String obterItem() {
        return "ItemPedido{quantidade=" + this.quantidade
                + ", ingrediente='" + ingrediente.getNome() + "'"
                + ", custoUnidade= R$ " + ingrediente.getPreco() + "}";
    }
}
