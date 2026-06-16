package main.java.lanche;

public class LanchePrototipo implements Cloneable {

    private int idPedido;
    private String nomeLanche;
    private double preco;
    private Receita receita;

    public LanchePrototipo(int idPedido, String nomeLanche, double preco, Receita receita) {
        this.idPedido = idPedido;
        this.nomeLanche = nomeLanche;
        this.preco = preco;
        this.receita = receita;
    }

    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public String getNomeLanche() { return nomeLanche; }
    public void setNomeLanche(String nomeLanche) { this.nomeLanche = nomeLanche; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public Receita getReceita() { return receita; }
    public void setReceita(Receita receita) { this.receita = receita; }

    @Override
    public LanchePrototipo clone() throws CloneNotSupportedException {
        LanchePrototipo clone = (LanchePrototipo) super.clone();
        clone.receita = this.receita.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "LanchePrototipo{idPedido=" + idPedido
                + ", nomeLanche='" + nomeLanche + "'"
                + ", preco=" + preco
                + ", receita=" + receita + "}";
    }
}
