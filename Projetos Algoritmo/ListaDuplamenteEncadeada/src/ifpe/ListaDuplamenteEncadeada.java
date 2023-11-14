package ifpe;

public class ListaDuplamenteEncadeada {

	private No head;
	private No end;
	private int tamanho;
	private No noTemp;

	public ListaDuplamenteEncadeada() {
		super();
		this.head = null;
		tamanho = 0;
		this.noTemp = null;
	}

	public void add(String dado) {
		No novoNo = new No(dado);
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
		No novoNo = new No(dado);
		index--;
		if (index == 1) {
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
}
