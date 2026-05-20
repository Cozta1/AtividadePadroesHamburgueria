package main.java.preparo;

public class PreparoXFrango extends PreparoLanche {

    @Override
    public String prepararPao() {
        return "Tostar pao brioche";
    }

    @Override
    public String prepararProteina() {
        return "Grelhar file de frango";
    }

    @Override
    public String adicionarAcompanhamentos() {
        return "Queijo, alface e maionese";
    }

    @Override
    public String getTipo() {
        return "X-Frango";
    }
}
