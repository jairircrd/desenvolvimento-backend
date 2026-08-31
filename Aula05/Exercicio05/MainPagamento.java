import java.util.ArrayList;
import java.util.List;

public class MainPagamento {
    public static void main(String[] args) {

        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(
            new PagamentoPix(1000.0, "31/08/2026", "email@pix.com")
        );

        pagamentos.add(
            new PagamentoCartao(1000.0, "31/08/2026", "123456789", 3)
        );

        pagamentos.add(
            new PagamentoBoleto(1000.0, "31/08/2026", "123456789012345")
        );

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento();
            System.out.println("Taxa: R$ " + pagamento.calcularTaxa());
            System.out.println();
        }
    }
}
