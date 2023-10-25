package ifpe;

public abstract class Midia {
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

	public String getTipo() {
		return getClass().getSimpleName();
	}

	public String getDetalhes() {
		return "Midia [codigo=" + codigo + ", preco=" + preco + ", nome=" + nome + ", getTipo()=" + getTipo() + "]";
	}

	public void printDados() {

	}

	public void inserirDados() {

	}

}
