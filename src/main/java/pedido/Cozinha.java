package main.java.pedido;

public class Cozinha extends Subsistema {

    private static Cozinha instancia = new Cozinha();

    private Cozinha() {}

    public static Cozinha getInstancia() {
        return instancia;
    }
}
