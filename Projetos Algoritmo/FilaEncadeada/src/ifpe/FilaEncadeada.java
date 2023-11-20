package ifpe;

public class FilaEncadeada {
	private No topo;
	private No end;
	private No noTemp;
	private int tamanho;

	public FilaEncadeada() {
		super();
		this.topo = null;
		this.noTemp = null;
		this.tamanho = 0;
	}

	public void enqueue(String dado) {
		No novoNo = new No(dado);
		if (topo == null) {
			topo = novoNo;
			end = novoNo;
		} else {
			end.setNext(novoNo);
			end = novoNo;
		}
		tamanho++;
	}

	public String dequeue() {
		String elemento = end.getDado();
		topo = topo.getNext();
		tamanho--;
		return elemento;
	}

	public int size() {
		return tamanho;
	}

	public boolean isEmpty() {
		return tamanho == 0;
	}

	public String front() {
		return topo.getDado();
	}

	public void print() {
		noTemp = topo;
		for (int i = 0; i < tamanho; i++) {
			System.out.print(noTemp.getDado() + " ; ");
			noTemp = noTemp.getNext();
		}
		System.out.println();
	}
}
