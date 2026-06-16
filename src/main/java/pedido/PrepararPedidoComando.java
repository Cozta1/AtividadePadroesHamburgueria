package main.java.pedido;

public class PrepararPedidoComando implements Comando {

    private final EstacaoCozinha cozinha;

    public PrepararPedidoComando(EstacaoCozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public void executar() {
        this.cozinha.prepararPedido();
    }

    @Override
    public void desfazer() {
        this.cozinha.cancelarPreparo();
    }
}
