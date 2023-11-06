package ifpe;

public class ListaLincada {

	private No head;
	
	public void add(String dado) {
		// TODO Auto-generated method stub
		No NovoNo = new No("1");
		if (head == null) {
			head = NovoNo;
		}else {
			No noTemp = head;
			while(noTemp != null) {
				noTemp = noTemp.next;
			}
			noTemp.next = NovoNo;
		}
	}
	public void print() {
		No noTemp = head;
		while(noTemp != null) {
			System.out.println(noTemp.dado + " ");	
			noTemp = noTemp.next;
		}
		System.out.println();
		
		
	}
}
