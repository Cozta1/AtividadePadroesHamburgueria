package main.java.pedido;

public class ValorItem implements ExpressaoPedido {

    private double valor;

    public ValorItem(double valor) {
        this.valor = valor;
    }

    public double interpretar() {
        return valor;
    }

    public double getValor() {
        return this.valor;
    }
}
