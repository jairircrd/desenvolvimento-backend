package exercicios.exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: R$ ");
        double saldo = scanner.nextDouble();

        System.out.println("\n1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Saldo atual: R$ " + saldo);
                break;

            case 2:
                System.out.println("Digite o valor do depósito: R$ ");
                double deposito = scanner.nextDouble();

                if (deposito > 0) {
                    saldo = saldo + deposito;
                    System.out.println("Novo saldo: R$ " + saldo);
                } else {
                    System.out.println("Valor inválido.");
                }

                break;

            case 3:
                System.out.println("Digite o valor do saque: R$ ");
                double saque = scanner.nextDouble();

                if (saque > 0 && saque <= saldo) {
                    saldo = saldo - saque;
                    System.out.println("Saque realizado");
                    System.out.println("Novo saldo: R$ " + saldo);
                } else {
                    System.out.println("Valor inválido ou saldo insuficiente");
                }

                break;

            case 4:
                System.out.println("Programa encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}