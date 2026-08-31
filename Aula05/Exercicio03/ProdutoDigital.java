public class ProdutoDigital extends Produto {

    public ProdutoDigital(String codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 0;
    }
}
