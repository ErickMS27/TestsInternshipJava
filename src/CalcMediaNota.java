package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcMediaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double nota1 = receberNota(scanner, "Digite a sua primeira nota: ");
            double nota2 = receberNota(scanner, "\nDigite a sua segunda nota: ");
            double nota3 = receberNota(scanner, "\nDigite a sua terceira nota: ");
            double nota4 = receberNota(scanner, "\nDigite a sua quarta nota: ");

            List<Double> notas = new ArrayList<>();
            notas.add(nota1);
            notas.add(nota2);
            notas.add(nota3);
            notas.add(nota4);

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("\nNotas inseridas:\n");

            for (int i = 0; i < notas.size(); i++) {
                System.out.println((i + 1) + "º" + " Nota " + ": " + notas.get(i));
            }

            System.out.println("\nMédia das notas = " + media);

            if (media >= 7) {
                System.out.println("Você está aprovado(a)!");
            } else if (media >= 4 && media < 7) {
                System.out.println("Você está em recuperação.");
            } else {
                System.out.println("Você está reprovado(a).");
            }

            System.out.print("\nDeseja reiniciar a aplicação? (Y/N): ");
            String restart = scanner.next();
            if (!restart.toLowerCase().equals("y")) {
                System.out.println("Aplicação encerrada.");
                break;
            }
        }

        scanner.close();
    }

    private static double receberNota(Scanner scanner, String mensagemNota) {
        double nota;
        do {
            System.out.print(mensagemNota);
            while (!scanner.hasNextDouble()) {
                System.out.println("Nota inválida. Por favor, digite um número.");
                System.out.print(mensagemNota);
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
