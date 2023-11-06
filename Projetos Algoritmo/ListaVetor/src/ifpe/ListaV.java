package ifpe;

import java.util.Arrays;

public class ListaV {

	private String[] vetor;
	private int tamanho = 0;

	public ListaV() {
		vetor = new String[tamanho];
	}

	// Metodos auxiliareis

	private void tornarMaior() {
		// Esse metodo ira fazer uma copia do vetor com mais um espaço null a o final
		// do vetor
		String[] tempVetor = new String[tamanho + 1];
		for (int i = 0; i < tamanho; i++) {
			tempVetor[i] = vetor[i];
		}
		vetor = tempVetor;
	}

	private void tonarMenor() {
		// Esse metodo ira fazer uma copia do vetor usando uma variavel temporaria, os
		// elementos nulos serão removidos do vetor
		String[] tempVetor = new String[tamanho - 1];
		int j = 0;
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] != null) {
				tempVetor[j] = vetor[i];
				j++;
			}

		}
		vetor = tempVetor;
		tamanho--;
	}

	// Metodos publicos

	public void add(String elemento) {
		// Esse metodo ira adicionar um elemento a o final do vetor, onde o elememto ira
		// substituir o valo null a o final do vetor
		tornarMaior();
		vetor[tamanho] = elemento;
		tamanho++;
	}

	public void add(int posicao, String elemento) {
		// Esse metodo empurra os elementos para o final da lista abrindo espaço para
		// adição do novo elememto
	    tornarMaior();
	    for (int i = tamanho - 1; i >= posicao; i--) {
	        vetor[i + 1] = vetor[i];
	    }
	    vetor[posicao -1] = elemento;
	    tamanho++;
	}

	public void set(int posicao, String elemento) {
		// Esse metodo substitui um elemeto por outro
		vetor[posicao - 1] = elemento;
	}

	public void remove(int posicao) {
		// Esse metodo remove um elemento de acordo com a posilcao atribuida
		vetor[posicao - 1] = null;
		tonarMenor();
	}
	
	public String get(int posicao) {
		// Esse metodo pega apenas um elemento presente na lista
		return vetor[posicao -1 ];
		
	}
	public int size() {
		//Esse metodo retorna o tamanho da lista
		return tamanho;
		
	}

	@Override
	public String toString() {
		return "ListaV [vetor=" + Arrays.toString(vetor) + ", tamanho=" + tamanho + "]";
	}
}
