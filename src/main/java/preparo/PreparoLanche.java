package main.java.preparo;

public abstract class PreparoLanche {

    public String preparar() {
        return prepararPao()
                + " | " + prepararProteina()
                + " | " + adicionarAcompanhamentos()
                + " | finalizar e servir";
    }

    public String prepararPao() {
        return "Tostar pao comum";
    }

    public abstract String prepararProteina();

    public abstract String adicionarAcompanhamentos();

    public String getTipo() {
        return "Lanche";
    }
}
