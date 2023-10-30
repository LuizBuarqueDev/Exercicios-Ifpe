package ifpe;


public  class Arquivo {
	
	private int kbytes;
	private double preco;
	private String autor;
	
	public Arquivo() {
		// TODO Auto-generated constructor stub
	}
	
	public Arquivo(int kbytes, double preco, String autor) {
		super();
		this.kbytes = kbytes;
		this.preco = preco;
		this.autor = autor;
	}
	
	public  String getTipo() {
		return getClass().getSimpleName();
		
	}
	
	public  String getDetalhe() {
		return null;
	}
	
	public void printDados() {
		System.out.println("Tipo: " + getTipo());
		System.out.println("Detalhe: " + getDetalhe());
	}
	
	public  void inserirDados(String nome) {
		
	}

	public int getKbytes() {
		return kbytes;
	}

	public void setKbytes(int kbytes) {
		this.kbytes = kbytes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
