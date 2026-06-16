package main.java.pedido;

public class EstacaoCozinha {

    private final String lanche;
    private String situacao;

    public EstacaoCozinha(String lanche) {
        this.lanche = lanche;
        this.situacao = "Pedido aguardando";
    }

    public String getSituacao() {
        return situacao;
    }

    public void prepararPedido() {
        this.situacao = "Pedido '" + lanche + "' em preparo";
    }

    public void cancelarPreparo() {
        this.situacao = "Pedido '" + lanche + "' cancelado";
    }
}
