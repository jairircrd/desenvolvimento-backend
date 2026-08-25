package exercicio02;

public class Main {

    public static void main(String[] args) {

        Servico servico = new Servico(
            "SER-010",
            "Consultoria em Tecnologia",
            "Avaliação da infraestrutura tecnológica.",
            3500
        );

        System.out.println("Código: " + servico.getCodigo());
        System.out.println("Nome: " + servico.getNome());
        System.out.println("Descrição: " + servico.getDescricao());
        System.out.println("Valor: R$ " + servico.getValor());

        servico.setValor(4200);
        System.out.println("Novo valor: R$ " + servico.getValor());

        servico.setValor(-100);
        System.out.println("Valor após tentativa inválida: R$ " + servico.getValor());
    }
}