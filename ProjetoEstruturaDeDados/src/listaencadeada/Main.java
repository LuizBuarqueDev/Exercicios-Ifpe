package listaencadeada;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"\n[1]-enqueue\n[2]-equeue\n[3]-size\n[4]-isEmpty\n[5]-front\n Qualquer numero invalido resultara na finalização do codigo");
		while (true) {

			String entrada = scanner.nextLine();
			if (entrada == "1") {

			} else if (entrada == "2") {

			} else if (entrada == "3") {

			} else if (entrada == "4") {

			} else if (entrada == "5") {

			} else {
				System.out.println("Fim da operação\n Fila: ");
				listaEncadeada.print();
				break;
			}

		}
	}

}
