package ifpe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int somaidades = 0;
        int totalidades = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a idade da " + (totalidades + 1) + "ª pessoa (ou digite 0 para sair): ");
            int idade = Integer.parseInt(scanner.nextLine());

            if (idade == 0) {
                break;
            }

            if (idade > 0) {
                somaidades += idade;
                totalidades++;
            } else {
                System.out.println("Idade inválida. Por favor, insira uma idade positiva.");
            }
        }

        if (totalidades > 0) {
            double mediaIdades = (double) somaidades / totalidades;
            System.out.println("Média das idades: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade válida foi inserida.");
        }
    }
}
