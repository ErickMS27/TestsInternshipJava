package src;

import java.util.Scanner;

public class ContRegressyiva {
    public static void main(String[] args) throws InterruptedException {
        int timeCount = 10;
        timeCountdown(timeCount);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDeseja reiniciar a aplicação? Se SIM clique Y, caso não queira, clique N:");
            String restart = scanner.next();

            if (!restart.toLowerCase().equals("y")) {
                System.out.println("\nAplicação encerrada.");
                break;
            }

            timeCountdown(timeCount);
        }

        scanner.close();
    }

    private static void timeCountdown(int timeSec) throws InterruptedException {
        for (int i = timeSec; i > 0; i--) {
            System.out.println("Contagem regressiva: " + i + " segundos");
            Thread.sleep(1000);
        }

        System.out.println("\nFELIZ ANO NOVO!");
    }
}
