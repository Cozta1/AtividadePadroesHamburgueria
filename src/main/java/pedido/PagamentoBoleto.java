package main.java.pedido;

public class PagamentoBoleto implements FormaPagamento {

    private static final double TARIFA = 3.50;

    public double pagar(double valor) {
        return valor + TARIFA;
    }
}
