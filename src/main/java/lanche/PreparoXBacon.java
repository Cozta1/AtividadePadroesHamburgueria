package main.java.lanche;

public class PreparoXBacon extends PreparoLanche {

    @Override
    public String prepararProteina() {
        return "Grelhar carne de boi";
    }

    @Override
    public String adicionarAcompanhamentos() {
        return "Queijo, bacon e molho";
    }

    @Override
    public String getTipo() {
        return "X-Bacon";
    }
}
