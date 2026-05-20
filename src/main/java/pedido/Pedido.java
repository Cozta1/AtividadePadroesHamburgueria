package main.java.pedido;

import main.java.Hamburguer;
import main.java.preparo.PreparoLanche;

public class Pedido {

    private PedidoEstado estado;
    private Hamburguer hamburguer;
    private PreparoLanche preparo;

    public Pedido() {
        this.estado = PedidoEstadoRecebido.getInstance();
    }

    public Pedido(Hamburguer hamburguer) {
        this();
        this.hamburguer = hamburguer;
    }

    public Pedido(Hamburguer hamburguer, PreparoLanche preparo) {
        this(hamburguer);
        this.preparo = preparo;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getNome();
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public PreparoLanche getPreparo() {
        return preparo;
    }

    public void setPreparo(PreparoLanche preparo) {
        this.preparo = preparo;
    }

    public String instrucoesPreparo() {
        return preparo == null ? "" : preparo.preparar();
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }
}
