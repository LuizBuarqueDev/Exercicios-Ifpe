package ifpe;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public double getPay() {
        return 0;
    }

    public void printPay() {
        System.out.println("Nome: " + name + ", Salário: " + getPay());
    }
}