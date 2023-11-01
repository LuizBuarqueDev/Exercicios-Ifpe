package ifpe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Veiculo> veiculos = new ArrayList<>();

		while (true) {
			System.out.println("Deseja inserir um veículo? (Sim/Não)");
			String escolha = scanner.nextLine();

			if (escolha.equalsIgnoreCase("Sim")) {
				System.out.println("Insira o tipo de veículo (Moto/Carro): ");
				String tipo = scanner.nextLine();

				System.out.println("Insira o modelo do veículo: ");
				String modelo = scanner.nextLine();

				System.out.println("Insira o preço do veículo: ");
				double preco = scanner.nextDouble();

				if (tipo.equalsIgnoreCase("Moto")) {
					System.out.println("Insira o ano da moto: ");
					int ano = scanner.nextInt();
					veiculos.add(new Moto(modelo, preco, ano));
				} else if (tipo.equalsIgnoreCase("Carro")) {
					System.out.println("Insira os quilômetros do carro: ");
					double km = scanner.nextDouble();
					veiculos.add(new Carro(modelo, preco, km));
				}
				scanner.nextLine(); 
			} else {
				break;
			}
		}

		System.out.println("Relatório de Veículos:");
		for (Veiculo veiculo : veiculos) {
			veiculo.printDados();
			System.out.println("Preço com ajuste: " + veiculo.getPreco());
			System.out.println("------------------------");
		}

		double totalPreco = 0;
		for (Veiculo veiculo : veiculos) {
			totalPreco += veiculo.getPreco();
		}

		System.out.println("Total de preços antes do ajuste: " + totalPreco);


		for (Veiculo veiculo : veiculos) {
			totalPreco -= veiculo.getPreco();
			totalPreco += veiculo.getPreco();
		}

		System.out.println("Total de preços após os ajustes: " + totalPreco);
	}
}