package ifpe;

import java.util.Scanner;

class Salaried extends Employee {
    private double salary;

    public Salaried(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        this.salary = scanner.nextDouble();
    }
}