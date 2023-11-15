package ifpe;

public class Main {
	public static void main(String[] args) {
		PilhaVetor pilha = new PilhaVetor();

		pilha.push("1");
		pilha.push("2");
		
		System.out.println(pilha.size());

		pilha.print();

		System.out.println("pop: " + pilha.pop());
		
		pilha.push("5");
		pilha.push("6");
		
		System.out.println(pilha.size());
		
		System.out.println("top:" + pilha.top());

		pilha.print();
		
		System.out.println(pilha.isEmpty());

	}

}
