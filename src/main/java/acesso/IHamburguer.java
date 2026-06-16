package main.java.acesso;

import java.util.List;

public interface IHamburguer {
    List<String> obterDadosPublicos();
    List<String> obterReceitaSecreta(Funcionario funcionario);
}
