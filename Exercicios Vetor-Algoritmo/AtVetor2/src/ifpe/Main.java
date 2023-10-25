package ifpe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[5];
		for (int R1 = 0; R1 < vetor.length; R1++) {
			System.out.println("Digite a idade da " + (R1 + 1) + "° pessoa:");
			int idade = Integer.parseInt(input.nextLine());
			vetor[R1] = idade;
		}
		int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;

		for (int R2 = 0; R2 < vetor.length; R2++) {
			if (vetor[R2] <= 15) {
				f1++;
			} else if (vetor[R2] <= 30) {
				f2++;
			} else if (vetor[R2] <= 45) {
				f3++;
			} else if (vetor[R2] <= 60) {
				f4++;
			} else {
				f5++;
			}

		}
		System.out.printf("\nO número de pessoas na 1ª faixa etária é de %d e correspondem a %.2f%% de %d ", f1,
				((double) f1 / vetor.length) * 100, vetor.length);
		System.out.printf("\nO número de pessoas na 2ª faixa etária é de %d e correspondem a %.2f%% de %d ", f2,
				((double) f2 / vetor.length) * 100, vetor.length);
		System.out.printf("\nO número de pessoas na 3ª faixa etária é de %d e correspondem a %.2f%% de %d ", f3,
				((double) f3 / vetor.length) * 100, vetor.length);
		System.out.printf("\nO número de pessoas na 4ª faixa etária é de %d e correspondem a %.2f%% de %d ", f4,
				((double) f4 / vetor.length) * 100, vetor.length);
		System.out.printf("\nO número de pessoas na 5ª faixa etária é de %d e correspondem a %.2f%% de %d ", f5,
				((double) f5 / vetor.length) * 100, vetor.length);

	}

}
