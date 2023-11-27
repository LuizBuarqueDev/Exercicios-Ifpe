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
	        throw new IndexOutOfBoundsException("Índice inválido");
	    }

	    if (index < tamanho / 2) {
	        noTemp = head;
	        for (int i = 0; i < index; i++) {
	            noTemp = noTemp.getNext();
	        }

	    } else {
	        noTemp = end;
	        for (int i = tamanho - 1; i > index; i--) {
	            noTemp = noTemp.getPrev();
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
		index--;
		if (index < 0 || index >= tamanho) {
			throw new IndexOutOfBoundsException("Indice invalido");
		}
		
		NoDuplo novoNo = new NoDuplo(dado);
		
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
		index--;
	    if (head == null || tamanho <= 0) {
	        throw new NullPointerException("A lista está vazia");
	    }

	    noTemp = pegarIndex(index);

	    if (noTemp == head) {
	        head = noTemp.getNext();
	        if (head != null) {
	            head.setPrev(null);
	        } else {
	            end = null;
	        }
	        
	    } else if (noTemp == end) {
	        end = noTemp.getPrev();
	        end.setNext(null);
	    } else {
	        noTemp.getPrev().setNext(noTemp.getNext());
	        noTemp.getNext().setPrev(noTemp.getPrev());
	    }

	    tamanho--;
	}

	public void set(int index, String entrada) {
		index--;
		if (index < 0 || index >= tamanho) {
			throw new IndexOutOfBoundsException("Indice invalido");
		}

		pegarIndex(index).setDado(entrada);
	}

	public int size() {
		return tamanho;
	}

	public String get(int index) {
		index--;
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