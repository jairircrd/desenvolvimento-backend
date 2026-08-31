public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public PagamentoBoleto(double valor, String data, String codigoBarras) {
        super(valor, data);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via boleto processado.");
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.01;
    }
}
