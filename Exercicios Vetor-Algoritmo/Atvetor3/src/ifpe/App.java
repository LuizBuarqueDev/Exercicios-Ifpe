package ifpe;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor");
		int t = 10;
		for (int R1 = 0; R1 < t; R1++) {
			System.out.printf("\n %d * %d = %d", R1+1, t, ((R1+1) * t));
		}
	}

}
