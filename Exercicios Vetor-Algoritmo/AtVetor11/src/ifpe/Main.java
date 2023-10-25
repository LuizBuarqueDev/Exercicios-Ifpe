package ifpe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaAltura = 0;
		int total = 0;
		while (true) {
			System.out.printf("\nDigite a altura da %d pessoa: ", (total+1));
			double altura = Double.parseDouble(scanner.nextLine());
			if (altura <= 0) {
				break;
			} else {
				total++;
				somaAltura += altura;
			}
		}
	System.out.printf("Media :%.2f ", (double) somaAltura/total);
	}
}
