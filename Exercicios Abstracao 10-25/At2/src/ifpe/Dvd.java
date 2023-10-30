package ifpe;

public class Dvd extends Midia{
	
	private int nFaixas;

	public Dvd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dvd(int codigo, double preco, String nome , int nFaixas) {
		super(codigo, preco, nome);
		this.nFaixas = nFaixas;
		// TODO Auto-generated constructor stub
	}

	@Override	
	public String getDetalhe() {
		// TODO Auto-generated method stub
		return "Dvd [nFaixas=" + nFaixas + ", Codigo =" + getCodigo() + ", Preco =" + getPreco()
		+ ", Nome =" + getNome() + "]";
	}

	@Override
	public void inserirDados(String nome) {
		setCodigo(random.nextInt(1000));
		setPreco(random.nextDouble(50.0));
		setNome(nome);
		setnFaixas(random.nextInt(50));
	}

	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
}
