package main.java.pedido;

public class Entrega extends Subsistema {

    private static Entrega instancia = new Entrega();

    private Entrega() {}

    public static Entrega getInstancia() {
        return instancia;
    }
}
