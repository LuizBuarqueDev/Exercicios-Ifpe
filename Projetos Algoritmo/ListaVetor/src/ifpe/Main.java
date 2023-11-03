package ifpe;

public class Main {
	public static void main(String[] args) {
		
		ListaV listaV = new ListaV();
		
		listaV.add("Teste 1");
		listaV.add("Teste 2");
		listaV.add("Teste 3");
		
		System.out.println(listaV.toString());
		
		listaV.add(2,"Elemento 2 ");
		
		System.out.println("Get: " +  listaV.get(2));
		
		System.out.println(listaV.toString());
		
		listaV.remove(1);
		
		System.out.println(listaV.toString());
		
		System.out.println("Size: " + listaV.size());
		
	}

}
