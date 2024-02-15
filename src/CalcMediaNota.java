package src;

import java.util.Scanner;

public class CalcMediaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double nota1 = receberNota(scanner, "Digite a sua primeira nota: ");
            double nota2 = receberNota(scanner, "\nDigite a sua segunda nota: ");
            double nota3 = receberNota(scanner, "\nDigite a sua terceira nota: ");
            double nota4 = receberNota(scanner, "\nDigite a sua quarta nota: ");

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("\nNotas inseridas:\n");
            System.out.println("Primeira nota: " + nota1);
            System.out.println("Segunda nota: " + nota2);
            System.out.println("Terceira nota: " + nota3);
            System.out.println("Quarta nota: " + nota4);

            System.out.println("\nMédia das notas = " + media);

            System.out.print("\nDeseja reiniciar a aplicação? (Y/N): ");
            String restart = scanner.next();
            if (!restart.toLowerCase().equals("y")) {
                System.out.println("Aplicação encerrada.");
                break;
            }
        }

        scanner.close();
    }

    private static double receberNota(Scanner scanner, String mensagem) {
        double nota;
        do {
            System.out.print(mensagem);
            while (!scanner.hasNextDouble()) {
                System.out.println("Nota inválida. Por favor, digite um número.");
                System.out.print(mensagem);
                scanner.next();
            }
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Por favor, digite novamente uma nota entre 0 e 10.");
            }

        } while (nota < 0 || nota > 10);

        return nota;
    }
}
