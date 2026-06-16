package main.java.pedido;

public class PagamentoCartaoDebito implements FormaPagamento {

    private static final double DESCONTO = 0.05;

    public double pagar(double valor) {
        return valor * (1 - DESCONTO);
    }
}
