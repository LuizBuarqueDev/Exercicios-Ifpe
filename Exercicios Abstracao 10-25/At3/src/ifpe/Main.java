package ifpe;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();

		ArrayList<Arquivo> listaArquivos = new ArrayList<Arquivo>();

		int numObjetos = 5;
		
		for (int rr = 0; rr < numObjetos; rr++) {
			if (random.nextInt(2) == 0) {
				listaArquivos.add(new Mp3("Autor_Mp3_" + (rr + 1)));
			} else {
				listaArquivos.add(new Mp4("Autor_Mp4_" + (rr + 1)));
			}	
		}
		
		for (Arquivo arquivo : listaArquivos) {
			System.out.println("----------------------------------------------");
			if (arquivo instanceof Mp3) {
				System.out.println("Mp3 : " + arquivo.getClass().getSimpleName());
				int nDowloads = ((Mp3) arquivo).getnDownloads();
				if (nDowloads > 5000){
					double precoAntigo = arquivo.getPreco();
					double aumento = precoAntigo * 0.05;
					double novoPreco = precoAntigo + aumento;
					arquivo.setPreco(novoPreco);
					System.out.println("Valor alterado: " + precoAntigo + "+" + aumento + " = "  + novoPreco);			
				
				}else if (arquivo instanceof Mp4){
					System.out.println("Mp4: " + arquivo.getClass().getSimpleName());
					int nVisitas = ((Mp4)arquivo).getnVisitas();
					if (nVisitas > 10000) {
						double precoAntigo = arquivo.getPreco();
						double aumento = precoAntigo * 0.08;
						double novoPreco = precoAntigo + aumento;
						arquivo.setPreco(novoPreco);
						System.out.println("Valor alterado: " + precoAntigo + "+" + aumento + " = "  + novoPreco);
					}
				}
			}
			arquivo.printDados();
		}
	}
}
