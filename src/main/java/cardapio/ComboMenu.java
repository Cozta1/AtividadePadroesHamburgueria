package main.java.cardapio;

import java.util.ArrayList;
import java.util.List;

public class ComboMenu extends ItemMenu {

    private List<ItemMenu> itens = new ArrayList<>();

    public ComboMenu(String nome) {
        super(nome);
    }

    public ComboMenu adicionar(ItemMenu item) {
        this.itens.add(item);
        return this;
    }

    @Override
    public float getPreco() {
        float total = 0f;
        for (ItemMenu item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String getDescricao() {
        StringBuilder sb = new StringBuilder(getNome()).append("[");
        for (int i = 0; i < itens.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(itens.get(i).getDescricao());
        }
        return sb.append("]").toString();
    }
}
