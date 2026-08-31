public class Main {
    public static void main(String[] args) {

        Filme filme1 = new FilmeAcao(
                "John Wick",
                101,
                "18 anos",
                "Alto"
        );

        Filme filme2 = new FilmeDocumentario(
                "Planeta Terra",
                90,
                "Livre",
                "Natureza"
        );

        filme1.exibirDetalhes();

        System.out.println();

        filme2.exibirDetalhes();
    }
}
