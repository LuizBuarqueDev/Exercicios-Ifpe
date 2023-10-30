package ifpe;

public class Cd extends Midia{
	
	private int nMusica;

	public Cd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cd(int codigo, double preco, String nome, int nMusica) {
		super(codigo, preco, nome);
		this.nMusica = nMusica;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDetalhe() {
		// TODO Auto-generated method stub
		return "Cd [nMusica=" + nMusica + ", getCodigo =" + getCodigo() + ", getPreco =" + getPreco() + ", getNome ="
		+ getNome() + "]";
	}

	@Override
	public void inserirDados(String nome) {
		// TODO Auto-generated method stub
		setCodigo(random.nextInt(1000));
		setPreco(random.nextDouble(50.0));
		setnMusica(random.nextInt(50));
		setNome(nome);
	}

	public int getnMusica() {
		return nMusica;
	}

	public void setnMusica(int nMusica) {
		this.nMusica = nMusica;
	}
}
