package ifpe;

public class Main {
	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		listaEncadeada.add("1");
		listaEncadeada.add("2");
		listaEncadeada.add("3");
		listaEncadeada.add("4");
		listaEncadeada.add("5");
		listaEncadeada.add("6");
		listaEncadeada.print();
		System.out.println("Size: " + listaEncadeada.size());
		listaEncadeada.add(5, "2.0");
		listaEncadeada.add(1,"1.1");
		System.out.println("Get: " + listaEncadeada.get(3));
		listaEncadeada.print();
		listaEncadeada.remove(5);
		listaEncadeada.print();
		listaEncadeada.set(5, "Teste set");
		listaEncadeada.print();
	}
}
