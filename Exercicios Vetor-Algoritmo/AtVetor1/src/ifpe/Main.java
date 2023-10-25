package ifpe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int t = Integer.parseInt(input.nextLine());
		int soma = 0;
		for (int R1 = 0; R1 < t; R1++) {
			if (R1 % 2 != 0) {
				System.out.println("Impar: " + R1);
				soma += R1;
			}
		}
		System.out.println("Soma: " + soma);
	}
}
