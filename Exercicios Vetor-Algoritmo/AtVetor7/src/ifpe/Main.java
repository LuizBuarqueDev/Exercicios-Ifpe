package ifpe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int mais90eMenos1_5 = 0;
		for(int r1 = 0 ; r1<10 ; r1++) {
			System.out.println("Idade: ");
			int idade = Integer.parseInt(scanner.nextLine());
			System.out.println("Altura: ");
			float altura = Float.parseFloat(scanner.nextLine());
			System.out.println("Peso: ");
			float peso = Float.parseFloat(scanner.nextLine());
			
			if (peso > 90 && altura < 1.5) {
				mais90eMenos1_5 += 1;
			}
		}
	}
}
