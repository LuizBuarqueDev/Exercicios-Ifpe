package ifpe;

public class Main {
	public static void main(String[] args) {
		PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
		
		pilhaEncadeada.push("1");
		pilhaEncadeada.push("2");
		pilhaEncadeada.push("3");
		
		System.out.println("size: " + pilhaEncadeada.size());
		
		pilhaEncadeada.push("7");
		pilhaEncadeada.push("9");
		
		pilhaEncadeada.print();
		
		System.out.println("Pop: " + pilhaEncadeada.pop());
		pilhaEncadeada.print();
		
		System.out.println("Top: " + pilhaEncadeada.top());
		
		System.out.println("size: " + pilhaEncadeada.size());
		System.out.println(pilhaEncadeada.isEmpty());
	}
}
