public class MainProduto {
    public static void main(String[] args) {

        Produto produto1 = new ProdutoFisico(
                "P001",
                "Teclado",
                150.0,
                2.0
        );

        Produto produto2 = new ProdutoDigital(
                "P002",
                "Curso Java",
                80.0
        );

        System.out.println("Frete do produto físico: R$ " + produto1.calcularFrete());
        System.out.println("Frete do produto digital: R$ " + produto2.calcularFrete());
    }
}
