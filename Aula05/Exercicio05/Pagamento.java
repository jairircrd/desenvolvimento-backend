public class Pagamento {
    protected double valor;
    protected String data;

    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento.");
    }

    public double calcularTaxa() {
        return 0;
    }
}
