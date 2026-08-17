package exercicios.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double percentualDesconto;

        if (valorCompra <= 100) {
            percentualDesconto = 0;
        } else if (valorCompra <= 500) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}