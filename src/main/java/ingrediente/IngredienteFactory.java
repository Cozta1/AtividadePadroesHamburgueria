package main.java.ingrediente;

import java.util.HashMap;
import java.util.Map;

public class IngredienteFactory {

    private static Map<String, Ingrediente> ingredientes = new HashMap<>();

    public static Ingrediente getIngrediente(String nome, double preco) {
        Ingrediente ingrediente = ingredientes.get(nome);
        if (ingrediente == null) {
            ingrediente = new Ingrediente(nome, preco);
            ingredientes.put(nome, ingrediente);
        }
        return ingrediente;
    }

    public static int getTotalIngredientes() {
        return ingredientes.size();
    }

    public static void limparIngredientes() {
        ingredientes.clear();
    }
}
