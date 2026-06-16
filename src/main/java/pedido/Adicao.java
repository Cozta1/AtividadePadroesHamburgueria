package main.java.pedido;

public class Adicao implements ExpressaoPedido {

    private double x;
    private double y;

    public Adicao(ValorItem elementoEsquerda, ValorItem elementoDireita) {
        x = elementoEsquerda.getValor();
        y = elementoDireita.getValor();
    }

    public double interpretar() {
        return x + y;
    }
}
