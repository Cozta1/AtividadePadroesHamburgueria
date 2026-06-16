package main.java.lanche;

public class Receita implements Cloneable {

    private String tipoPao;
    private String pontoCarne;

    public Receita(String tipoPao, String pontoCarne) {
        this.tipoPao = tipoPao;
        this.pontoCarne = pontoCarne;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public String getPontoCarne() {
        return pontoCarne;
    }

    public void setPontoCarne(String pontoCarne) {
        this.pontoCarne = pontoCarne;
    }

    @Override
    public Receita clone() throws CloneNotSupportedException {
        return (Receita) super.clone();
    }

    @Override
    public String toString() {
        return "Receita{tipoPao='" + tipoPao + "', pontoCarne='" + pontoCarne + "'}";
    }
}
