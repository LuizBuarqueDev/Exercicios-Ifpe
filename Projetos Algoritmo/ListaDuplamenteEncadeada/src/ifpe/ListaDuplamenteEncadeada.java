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
}
