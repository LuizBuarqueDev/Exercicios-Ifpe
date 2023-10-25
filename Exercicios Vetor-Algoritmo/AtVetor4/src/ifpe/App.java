package ifpe;

public class App {
	public static void main(String[] args) {
		int R1 = 1;
		int R2 = 1;
		for (R1 = 1; R1 < 10 + 1; R1++) {
			System.out.printf("\n%d * %d = %d", R1, R2, (R1 * R2));
			R2 = 1;
			for (R2 = 1; R2 < 10; R2++) {
				System.out.printf("\n%d * %d = %d", R1, R2, (R1 * R2));

			}
			System.out.printf("\n--------------------------------------\n");
		}

	}

}
