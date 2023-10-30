package ifpe;

public class Main {
	public static void main(String[] args) {
		
		Dvd dvd = new Dvd();
		dvd.inserirDados("Teste Dvd");
		dvd.printDados();
		
		Cd cd = new Cd();
		cd.inserirDados("Teste Cd");
		cd.printDados();
	}
}
