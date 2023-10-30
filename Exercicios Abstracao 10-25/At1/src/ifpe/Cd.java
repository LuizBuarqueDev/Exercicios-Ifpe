package ifpe;

public class Cd extends Midia {
	
	private int nMusicas ;

	public Cd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cd(int codigo, double preco, String nome, int nMusicas) {
		super(codigo, preco, nome);
		this.nMusicas = nMusicas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDetalhes() {
		// TODO Auto-generated method stub
		return "Cd [nMusicas=" + nMusicas + ", Codigo =" + getCodigo() + ", Preco =" + getPreco()
		+ ", Nome =" + getNome() + "]";
	}

	
	public void inserirDados(int codigo , double preco, String nome, int nMusicas) {
		// TODO Auto-generated method stub
		setCodigo(codigo);
		setPreco(preco);
		setNome(nome);
		setnMusicas(nMusicas);
	}

	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}
}
