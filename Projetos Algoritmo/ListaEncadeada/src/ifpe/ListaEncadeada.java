package ifpe;

public class ListaEncadeada {

	private No head;

	public void add(String dado) {
		No novoNo = new No(dado);
		if (head == null) {
			head = novoNo;
		} else {
			No noTemp = head;
			while (noTemp.next != null) {
				noTemp = noTemp.next;
			}
			noTemp.next = novoNo;
		}
	}

	public int size() {
		int tamanho = 0;
		No noTemp = head;

		while (noTemp != null) {
			noTemp = noTemp.next;
			tamanho++;
		}
		return tamanho;
	}

	public String get(int entrada) {
		int index = 0;
		No noTemp = head;
		while (index != entrada - 1) {
			noTemp = noTemp.next;
			index++;
		}

		return noTemp.dado;
	}

	public void print() {
		No noTemp = head;
		while (noTemp != null) {
			System.out.print(noTemp.dado + " ");
			noTemp = noTemp.next;
		}
		System.out.println();
	}
}
