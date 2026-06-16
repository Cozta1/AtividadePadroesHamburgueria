package main.java.ingrediente;

import java.util.ArrayList;
import java.util.List;

public class PedidoFlyweight {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(int quantidade, String nomeIngrediente, double preco) {
        Ingrediente ingrediente = IngredienteFactory.getIngrediente(nomeIngrediente, preco);
        itens.add(new ItemPedido(quantidade, ingrediente));
    }

    public List<String> obterItensPedido() {
        List<String> saida = new ArrayList<>();
        for (ItemPedido item : this.itens) {
            saida.add(item.obterItem());
        }
        return saida;
    }
}
