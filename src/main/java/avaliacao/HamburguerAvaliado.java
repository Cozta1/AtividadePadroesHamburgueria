package main.java.avaliacao;

public class HamburguerAvaliado {

    private IAvaliacao avaliacao;
    private AvaliacaoAdapter persistencia;

    public HamburguerAvaliado() {
        this.avaliacao = new AvaliacaoConceito();
        this.persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    public float getNota() {
        return persistencia.getNota();
    }
}
