package ifpe;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int totalDePessoas = 0;
		int pessoasmais50 = 0;
		int pessoas10e20 = 0, soma10e20 = 0;
		int mais40Kg = 0;
		Scanner input = new Scanner(System.in);
		for (int R1 = 0; R1 < 25; R1++) {
			int idade = Integer.parseInt(input.nextLine());
			double altura = Double.parseDouble(input.nextLine());
			double peso = Double.parseDouble(input.nextLine());
			totalDePessoas += 1;
			if (idade > 50) {
				pessoasmais50 += 1;
			}
			if (idade > 10 && idade < 20) {
				pessoas10e20 += 1;
				soma10e20 += idade;
			}
			if (peso < 40) {
				mais40Kg+=1;
			}

		}
		System.out.println("Pessoas com mais de 50: "+ pessoasmais50);
		System.out.println("Media da altura das pessoas entre 10 e 20 anos : " + (soma10e20 / pessoas10e20));
		System.out.println("Porcentagem de pessoas com peso menor que 40 quilos: " + totalDePessoas * mais40Kg / 100);
	}

}
