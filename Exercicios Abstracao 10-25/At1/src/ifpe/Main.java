package ifpe;

public class Main {
	public static void main(String[] args) {
		
		Dvd dvd = new Dvd();
		dvd.inserirDados(157, 5.50, "Gummy Bear",50 );
		dvd.setnFaixas(6);
		dvd.printDados();
		
		Cd cd =  new Cd();
		cd.inserirDados(666, 69.95, "Cd da Xuxa",50);
		cd.setnMusicas(50);
		cd.printDados();
		
		
	}
}
