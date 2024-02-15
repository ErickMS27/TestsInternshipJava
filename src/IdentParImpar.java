package src;

import java.util.Scanner;

public class IdentParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número inteiro: ");
            int numberTyped = scanner.nextInt();

            String outputResult = checkParity(numberTyped);

            System.out.printf("\nO número %d é: %s.%n", numberTyped, outputResult);

            System.out.print("\nDeseja verificar outro número? (Y/N): ");
            String restart = scanner.next();

            if (!restart.toLowerCase().equals("y")) {
                System.out.println("Aplicação encerrada.");
                break;
            }
        } while (true);

        scanner.close();
    }

    private static String checkParity(int number) {
        if (number % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }
}
