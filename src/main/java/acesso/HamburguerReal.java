package main.java.acesso;

import java.util.Arrays;
import java.util.List;

public class HamburguerReal implements IHamburguer {

    private Integer codigo;
    private String nome;
    private String descricao;
    private String ingredienteSecreto1;
    private String ingredienteSecreto2;

    public HamburguerReal(int codigo) {
        HamburguerReal objeto = BD.getHamburguer(codigo);
        this.codigo = codigo;
        this.nome = objeto.nome;
        this.descricao = objeto.descricao;
        this.ingredienteSecreto1 = objeto.ingredienteSecreto1;
        this.ingredienteSecreto2 = objeto.ingredienteSecreto2;
    }

    public HamburguerReal(Integer codigo, String nome, String descricao,
                          String ingredienteSecreto1, String ingredienteSecreto2) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.ingredienteSecreto1 = ingredienteSecreto1;
        this.ingredienteSecreto2 = ingredienteSecreto2;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public List<String> obterDadosPublicos() {
        return Arrays.asList(this.nome, this.descricao);
    }

    @Override
    public List<String> obterReceitaSecreta(Funcionario funcionario) {
        return Arrays.asList(this.ingredienteSecreto1, this.ingredienteSecreto2);
    }
}
