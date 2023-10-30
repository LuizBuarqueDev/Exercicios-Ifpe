package ifpe;

import java.util.Random;

public class Mp4 extends Arquivo{
	
	Random random = new Random();
	
	private int nVisitas;
	
	public Mp4() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Mp4(String autor) {
		super();
		inserirDados(autor);
	}



	public Mp4(int kbytes, double preco, String autor, int nVisitas) {
		super(kbytes, preco, autor);
		// TODO Auto-generated constructor stub
		this.nVisitas = nVisitas;
	}

	@Override
	public String getDetalhe() {
		// TODO Auto-generated method stub
		return "Mp4 [nVisitas=" + nVisitas + ", Kbytes=" + getKbytes() + ", Preco =" + getPreco()
		+ ", Autor =" + getAutor() + "]";
	}

	@Override
	public void inserirDados(String autor) {
		// TODO Auto-generated method stub
		setKbytes(random.nextInt(1000));
		setPreco(random.nextDouble(50.0));
		setAutor(autor);
		setnVisitas(random.nextInt(100000));;
	}
	
	public int getnVisitas() {
		return nVisitas;
	}

	public void setnVisitas(int nVisitas) {
		this.nVisitas = nVisitas;
	}
}
