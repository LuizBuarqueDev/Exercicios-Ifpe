package ifpe;

public class Main {
	public static void main(String[] args) {
		FilaVetor filaVetor = new FilaVetor();

		System.out.println("isEmpty: " + filaVetor.isEmpty());

		filaVetor.enqueue("1");
		filaVetor.enqueue("2");
		filaVetor.enqueue("3");

		filaVetor.print();

		System.out.println("dequeue: " + filaVetor.dequeue());

		System.out.println("Size: " + filaVetor.size());
		System.out.println("Front : " + filaVetor.front());
	}

}
