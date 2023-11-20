package ifpe;

public class ListaEncadeada {

	private No head;
	private int tamanho;
	private No noTemp;

	public ListaEncadeada() {
		super();
		this.head = null;
		this.tamanho = 0;
		this.noTemp = null;
	}

	public void add(String dado) {
		No novoNo = new No(dado);
		if (head == null) {
			head = novoNo;
		} else {
			noTemp = head;
			while (noTemp.getNext() != null) {
				noTemp = noTemp.getNext();
			}
			noTemp.setNext(novoNo);
		}
		tamanho++;
	}

	public void add(int index, String dado) {
		if (--index < 0 || index > tamanho) {
			throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
		}

		No novoNo = new No(dado);
		if (index == 0) {
			novoNo.setNext(head);
			head = novoNo;
		} else {
			noTemp = head;
			for (int i = 0; i < index - 1; i++) {
				noTemp = noTemp.getNext();
			}
			novoNo.setNext(noTemp.getNext());
			noTemp.setNext(novoNo);
		}
		tamanho++;
	}

	public void remove(int entrada) {
		if (head == null || tamanho == 0) {
			throw new NullPointerException("A lista esta vazia");
		}
		if (--entrada == 0) {
			head = head.getNext();
		} else {
			noTemp = head;
			for (int i = 0; i < entrada - 1; i++) {
				noTemp = noTemp.getNext();
			}
			noTemp.setNext(noTemp.getNext().getNext());
		}
	}

	public void set(int index, String entrada) {
		if (--index == 0) {
			head.setDado(entrada);
		} else {
			noTemp = head;
			for (int i = 0; i < index; i++) {
				noTemp = noTemp.getNext();
			}
			noTemp.setDado(entrada);
		}
	}

	public int size() {
		return tamanho;
	}

	public String get(int entrada) {
		int index = 0;
		noTemp = head;
		while (index != entrada - 1) {
			noTemp = noTemp.getNext();
			index++;
		}

		return noTemp.getDado();
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
