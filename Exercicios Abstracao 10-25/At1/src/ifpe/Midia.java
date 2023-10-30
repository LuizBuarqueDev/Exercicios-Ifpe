package ifpe;

public class Midia {
	private int codigo;
	private double preco;
	private String nome;
	
	public Midia() {
		// TODO Auto-generated constructor stub
	}

	public Midia(int codigo, double preco, String nome) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}

	public  String getTipo() {
		return getClass().getSimpleName();
	}

	public  String getDetalhes() {
		return null;
	}

	public void printDados() {
		System.out.println("Tipo: " + getTipo());
		System.out.println("Detalhes: " + getDetalhes());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
