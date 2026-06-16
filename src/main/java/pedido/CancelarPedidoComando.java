package main.java.pedido;

public class CancelarPedidoComando implements Comando {

    private final EstacaoCozinha cozinha;

    public CancelarPedidoComando(EstacaoCozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public void executar() {
        this.cozinha.cancelarPreparo();
    }

    @Override
    public void desfazer() {
        this.cozinha.prepararPedido();
    }
}
