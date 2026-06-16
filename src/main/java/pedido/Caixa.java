package main.java.pedido;

public class Caixa extends Subsistema {

    private static Caixa instancia = new Caixa();

    private Caixa() {}

    public static Caixa getInstancia() {
        return instancia;
    }
}
