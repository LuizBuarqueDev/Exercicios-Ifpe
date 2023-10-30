package ifpe;

import java.util.Random;

public class Mp3 extends Arquivo {
	
	Random random = new Random();
	
	private int nDownloads;

	public Mp3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mp3(String autor) {
		super();
		inserirDados(autor);
		// TODO Auto-generated constructor stub
	}
	

	public Mp3(int kbytes, double preco, String autor, int nDownloads) {
		super(kbytes, preco, autor);
		// TODO Auto-generated constructor stub
		this.nDownloads = nDownloads;
		
	}
	
	@Override
	public String getDetalhe() {
		// TODO Auto-generated method stub
		return "Mp3 [nDownloads=" + nDownloads + ", Kbytes=" + getKbytes() + ", Preco =" + getPreco()
		+ ", Autor =" + getAutor() + "]";
	}
	
	@Override
	public void inserirDados( String autor) {
		// TODO Auto-generated method stub
		setKbytes(random.nextInt(1000));
		setPreco(random.nextDouble(50.0));
		setAutor(autor);
		setnDownloads(random.nextInt(50000));
		
		
	}

	public int getnDownloads() {
		return nDownloads;
	}

	public void setnDownloads(int nDownloads) {
		this.nDownloads = nDownloads;
	}
}
