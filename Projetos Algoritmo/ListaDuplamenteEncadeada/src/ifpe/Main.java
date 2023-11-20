package ifpe;

public class Main {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		lista.add("Elemento1");
		lista.add("Elemento2");
		lista.add("Elemento3");
		lista.add("Elemento4");

		System.out.println("Lista inicial:");
		lista.print();

		lista.add(2, "NovoElemento");

		System.out.println("\nLista após adição:");
		lista.print();

		lista.remove(3);

		System.out.println("\nLista após remoção:");
		lista.print();

		lista.set(1, "ElementoModificado");

		System.out.println("\nLista após modificação:");
		lista.print();

		System.out.println("\nTamanho da lista: " + lista.size());

		System.out.println("\nElemento na posição 2: " + lista.get(2));

	}

}
