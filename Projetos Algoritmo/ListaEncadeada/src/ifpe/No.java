package ifpe;

public class No {
	
	public String dado;
	public No next;
	
	public No() {
		// TODO Auto-generated constructor stub
	}

	public No(String dado) {
		super();
		this.dado = dado;
		this.next = null;
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
}
