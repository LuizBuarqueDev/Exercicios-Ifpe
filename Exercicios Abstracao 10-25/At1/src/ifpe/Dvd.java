package ifpe;

public class Dvd extends Midia {
	
	private int nFaixas;

	public Dvd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dvd(int codigo, double preco, String nome, int nFaixas) {
		super(codigo, preco, nome);
		this.nFaixas = nFaixas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDetalhes() {
		// TODO Auto-generated method stub
		return "Dvd [nFaixas=" + nFaixas + ", Codigo =" + getCodigo() + ", Preco =" + getPreco()
		+ ", Nome =" + getNome() + "]";
	}
	
	public void inserirDados(int codigo, double preco, String nome, int nFaixas) {
		// TODO Auto-generated method stub
		setCodigo(codigo);
		setPreco(preco);
		setNome(nome);
		setnFaixas(nFaixas);
	}

	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
}
