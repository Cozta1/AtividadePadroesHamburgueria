package main.java.acesso;

import java.util.List;

public class HamburguerProxy implements IHamburguer {

    private HamburguerReal hamburguer;
    private Integer codigo;

    public HamburguerProxy(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public List<String> obterDadosPublicos() {
        if (this.hamburguer == null) {
            this.hamburguer = new HamburguerReal(this.codigo);
        }
        return this.hamburguer.obterDadosPublicos();
    }

    @Override
    public List<String> obterReceitaSecreta(Funcionario funcionario) {
        if (!funcionario.isGerente()) {
            throw new IllegalArgumentException("Funcionario nao autorizado");
        }
        if (this.hamburguer == null) {
            this.hamburguer = new HamburguerReal(this.codigo);
        }
        return this.hamburguer.obterReceitaSecreta(funcionario);
    }
}
