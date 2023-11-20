package listaduplamenteencadeada;

public class ListaDuplamenteEncadeada {
	
	private NoDuplo head;
	private NoDuplo end;
	private int tamanho;
	private NoDuplo noTemp;

	public ListaDuplamenteEncadeada() {
		super();
		this.head = null;
		tamanho = 0;
		this.noTemp = null;
	}

	// Metodo auxiliar
	private NoDuplo pegarIndex(int index) {
		if (index < 0 || index >= tamanho) {
			throw new IndexOutOfBoundsException("Indice invalido");
		}

		if (index < tamanho / 2) {
			noTemp = head;
			for (int i = 0; i < index; i++) {
				noTemp = noTemp.getNext();
			}

		} else {
			noTemp = end;
			for (int i = 0; i > index; i--) {
				noTemp = noTemp.getNext();
			}
		}
		return noTemp;
	}

	public void add(String dado) {
		NoDuplo novoNo = new NoDuplo(dado);
		if (head == null) {
			head = novoNo;
			end = novoNo;
		} else {
			end.setNext(novoNo);
			novoNo.setPrev(end);
			end = novoNo;
		}
		tamanho++;
	}

	public void add(int index, String dado) {
		if (index < 0 || index > tamanho) {
			throw new IndexOutOfBoundsException("Indice invalido");
		}
		NoDuplo novoNo = new NoDuplo(dado);
		index--;
		if (index == 0) {
			novoNo.setNext(head);
			head.setPrev(novoNo);
			head = novoNo;

		} else if (index == tamanho) {
			end.setNext(novoNo);
			novoNo.setPrev(end);
			end = novoNo;
		} else {
			noTemp = head;
			for (int i = 0; i < index - 1; i++) {
				noTemp = noTemp.getNext();
			}
			novoNo.setNext(noTemp.getNext());
			novoNo.setPrev(noTemp);
			noTemp.getNext().setPrev(novoNo);
			noTemp.setNext(novoNo);
		}

		tamanho++;
	}

	public void remove(int index) {
		if (head == null || tamanho <= 0) {
			throw new NullPointerException("A lista esta vazia");
		}
		index--;
		if (index == 0) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			} else {
				end = null;
			}

		} else if (index == tamanho - 1) {
			end = end.getPrev();
			end.setNext(null);
		} else {
			noTemp = head;
			for (int i = 0; i < index - 1; i++) {
				noTemp = noTemp.getNext();
			}
			noTemp.setNext(noTemp.getNext().getNext());
			noTemp.getNext().setPrev(noTemp);
		}

		tamanho--;
	}

	public void set(int index, String entrada) {
		index--;
		if (index < 0 || index >= tamanho) {
			throw new IndexOutOfBoundsException("Indice invalido");
		}

		noTemp = pegarIndex(index);
		noTemp.setDado(entrada);
	}

	public int size() {
		return tamanho;
	}

	public String get(int index) {
		if (index < 0 || index >= tamanho) {
			throw new IndexOutOfBoundsException("Indice invalido");
		}

		return pegarIndex(index).getDado();

	}

	public void print() {
		noTemp = head;
		while (noTemp != null) {
			System.out.print(noTemp.getDado() + "; ");
			noTemp = noTemp.getNext();
		}
		System.out.println();

	}

}
