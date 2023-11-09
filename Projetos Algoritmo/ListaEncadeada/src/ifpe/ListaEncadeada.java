package ifpe;

public class ListaEncadeada {

	private No head;

	private int tamanho;

	public ListaEncadeada() {
		super();
		this.head = null;
		this.tamanho = 0;
	}

	public void add(String dado) {
		No novoNo = new No(dado);
		if (head == null) {
			head = novoNo;
		} else {
			No noTemp = head;
			while (noTemp.getNext() != null) {
				noTemp = noTemp.getNext();
			}
			noTemp.setNext(novoNo);
		}
		tamanho++;
	}

	public void add(int index, String dado) {
		index--;
		if (index < 0 || index > tamanho) {
			throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
		}

		No novoNo = new No(dado);
		if (index == 0) {
			novoNo.setNext(head);
			head = novoNo;
		} else {
			No noTemp = head;
			for (int i = 0; i < index - 1; i++) {
				noTemp = noTemp.getNext();
			}
			novoNo.setNext(noTemp.getNext());
			noTemp.setNext(novoNo);
		}
		tamanho++;
	}

	public void remove(int index) {

	}

	public int size() {
		return tamanho;
	}

	public String get(int entrada) {
		int index = 0;
		No noTemp = head;
		while (index != entrada - 1) {
			noTemp = noTemp.getNext();
			index++;
		}

		return noTemp.getDado();
	}

	public void print() {
		No noTemp = head;
		while (noTemp != null) {
			System.out.print(noTemp.getDado() + " ");
			noTemp = noTemp.getNext();
		}
		System.out.println();
	}
}
