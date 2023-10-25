package ifpe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somapares = 0;
        int somaprimos = 0;

        for (int r1 = 0; r1 < 10; r1++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0) {
                somapares += num;
            }

            boolean ehPrimo = true;

            if (num <= 1) {
                ehPrimo = false;
            } else {
                for (int t = 2; t * t <= num; t++) {
                    if (num % t == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                somaprimos += num;
            }
        }

        System.out.println("Soma pares: " + somapares);
        System.out.println("Soma primos: " + somaprimos);
    }
}
