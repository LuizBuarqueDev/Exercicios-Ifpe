package ifpe;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		for (int R1 = 0; R1 < 15; R1++) {

			Scanner input = new Scanner(System.in);
			double somaVista = 0;
			double somaPrazo = 0;
					System.out.println("Digite o tipo de transação:\n[0] - Avista\n[1] - Prazo");
			String codigo = input.nextLine();

			System.out.println("Digite o valor da transação: ");
			double valor = Integer.parseInt(input.nextLine());
			
			if (codigo.equals("0")) {
				somaVista+= valor; 
			} else if (codigo.equals("1")) {
				somaPrazo += (valor/3) ; 
				
			} else {
				System.out.println("Digite um valor valido: ");
				break;
			}
		}
	}

}
