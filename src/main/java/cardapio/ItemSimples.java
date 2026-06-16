package main.java.cardapio;

import main.java.lanche.Hamburguer;

public class ItemSimples extends ItemMenu {

    private float preco;

    public ItemSimples(String nome, float preco) {
        super(nome);
        this.preco = preco;
    }

    // Integracao: cria um item a partir de qualquer Hamburguer do sistema.
    public ItemSimples(Hamburguer hamburguer) {
        super(hamburguer.getNome());
        this.preco = hamburguer.getValor();
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return getNome();
    }
}
