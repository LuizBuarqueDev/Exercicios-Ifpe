package ifpe;

public class Main {
	public static void main(String[] args) {
		FilaEncadeada filaEncadeada = new FilaEncadeada();

		System.out.println("isEmpty: " + filaEncadeada.isEmpty());

		filaEncadeada.enqueue("1");
		filaEncadeada.enqueue("2");
		filaEncadeada.enqueue("3");

		filaEncadeada.print();

		System.out.println("dequeue: " + filaEncadeada.dequeue());

		System.out.println("front: " + filaEncadeada.front());

		System.out.println("size: " + filaEncadeada.size());

		filaEncadeada.print();

	}
}
