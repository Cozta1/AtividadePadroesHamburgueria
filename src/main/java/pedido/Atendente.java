package main.java.pedido;

import java.util.ArrayList;
import java.util.List;

public class Atendente {

    private final List<Comando> comandos = new ArrayList<>();

    public void executarComando(Comando comando) {
        comandos.add(comando);
        comando.executar();
    }

    public void desfazerUltimoComando() {
        if (!comandos.isEmpty()) {
            Comando comando = comandos.remove(comandos.size() - 1);
            comando.desfazer();
        }
    }
}
