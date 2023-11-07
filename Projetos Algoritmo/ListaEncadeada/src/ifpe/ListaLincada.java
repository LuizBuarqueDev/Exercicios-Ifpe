package ifpe;

public class ListaLincada {

    private No head;

    public void add(String dado) {
        No novoNo = new No(dado);
        if (head == null) {
            head = novoNo;
        } else {
            No noTemp = head;
            while (noTemp.next != null) {
                noTemp = noTemp.next;
            }
            noTemp.next = novoNo;
        }
    }

    public void print() {
        No noTemp = head;
        while (noTemp != null) {
            System.out.print(noTemp.dado + " ");
            noTemp = noTemp.next;
        }
        System.out.println();
    }
}
