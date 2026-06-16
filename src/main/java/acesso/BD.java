package main.java.acesso;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, HamburguerReal> hamburgueres = new HashMap<>();

    public static HamburguerReal getHamburguer(Integer codigo) {
        return hamburgueres.get(codigo);
    }

    public static void addHamburguer(HamburguerReal hamburguer) {
        hamburgueres.put(hamburguer.getCodigo(), hamburguer);
    }
}
