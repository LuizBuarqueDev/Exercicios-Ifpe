package ifpe;

public class No {
	private String dado;
	private No next;
	private No prev;

	public No() {
		// TODO Auto-generated constructor stub
	}

	public No(String dado) {
		super();
		this.dado = dado;
		this.next = null;
		this.prev = null;
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	public No getNext() {
		return next;
	}

	public void setNext(No next) {
		this.next = next;
	}

	public No getPrev() {
		return prev;
	}

	public void setPrev(No prev) {
		this.prev = prev;
	}
}
