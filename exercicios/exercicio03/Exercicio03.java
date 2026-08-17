package exercicios.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if ( numero1 > numero2 ) {
            System.out.println("Primeiro maior");

        } else if ( numero1 < numero2 ) {
            System.out.println("Segundo maior");

        } else {
            System.out.println("Iguais");
        }

        scanner.close();
    }
}