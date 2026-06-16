package main.java.pedido;

public class PagamentoCartaoCredito implements FormaPagamento {

    private int parcelas;
    private static final double TAXA_JUROS = 0.02;

    public PagamentoCartaoCredito(int parcelas) {
        this.parcelas = parcelas;
    }

    public double pagar(double valor) {
        if (parcelas <= 0) {
            throw new IllegalArgumentException("Numero de parcelas invalido");
        }
        if (parcelas == 1) {
            return valor;
        }
        return valor * Math.pow(1 + TAXA_JUROS, parcelas);
    }

    public int getParcelas() {
        return parcelas;
    }
}
