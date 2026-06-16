package main.java.avaliacao;

public class AvaliacaoAdapter extends AvaliacaoNota {

    private IAvaliacao avaliacaoConceito;

    public AvaliacaoAdapter(IAvaliacao avaliacaoConceito) {
        this.avaliacaoConceito = avaliacaoConceito;
    }

    public String recuperarAvaliacao() {
        if (this.getNota() >= 9.0f) {
            avaliacaoConceito.setAvaliacao("EXCELENTE");
        } else if (this.getNota() >= 8.0f) {
            avaliacaoConceito.setAvaliacao("BOM");
        } else if (this.getNota() >= 7.0f) {
            avaliacaoConceito.setAvaliacao("REGULAR");
        } else {
            avaliacaoConceito.setAvaliacao("RUIM");
        }
        return avaliacaoConceito.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoConceito.getAvaliacao().equals("EXCELENTE")) {
            this.setNota(9.0f);
        } else if (avaliacaoConceito.getAvaliacao().equals("BOM")) {
            this.setNota(8.0f);
        } else if (avaliacaoConceito.getAvaliacao().equals("REGULAR")) {
            this.setNota(7.0f);
        } else {
            this.setNota(0.0f);
        }
    }
}
