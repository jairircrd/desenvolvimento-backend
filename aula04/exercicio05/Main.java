package exercicio05;

public class Main {

    public static void main(String[] args) {

        Consultor consultor = new Consultor(
                "CON-0089",
                "Ricardo",
                "jairircrd@gmail.com",
                5
        );

        Cliente cliente = new Cliente(
                "CTI-010",
                "Tecnologia",
                2,
                consultor
        );

        Servico servico1 = new Servico(
                "SER-001",
                "Diagnóstico Tecnológico",
                4500
        );

        Servico servico2 = new Servico(
                "SER-002",
                "Análise de Dados",
                3000
        );

        servico1.ativar();
        servico2.ativar();

        System.out.println("========== CTI INSIGHTS ==========");
        System.out.println();

        System.out.println("Cliente: " + cliente.getCodigoCti());
        System.out.println("Segmento: " + cliente.getSegmento());
        System.out.println("Nível: " + cliente.getNivel());
        System.out.println();

        System.out.println("Consultor:");
        System.out.println(consultor.getNome());
        System.out.println(
                consultor.getAnosExperiencia()
                        + " anos de experiência"
        );
        System.out.println();

        System.out.println("Serviço 1:");
        System.out.println(servico1.getNome());
        System.out.println("Valor: R$ " + servico1.getValor());
        System.out.println("Ativo: " + servico1.isAtivo());
        System.out.println();

        System.out.println("Serviço 2:");
        System.out.println(servico2.getNome());
        System.out.println("Valor: R$ " + servico2.getValor());
        System.out.println("Ativo: " + servico2.isAtivo());

        System.out.println("\nTestes com valores inválidos:");

        cliente.setNivel(5);
        consultor.setAnosExperiencia(-4);
        servico1.setValor(-100);
    }
}