public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(double valor, String data, String numeroCartao, int parcelas) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão processado.");
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.03;
    }
}
