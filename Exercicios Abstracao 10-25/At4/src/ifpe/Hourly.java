package ifpe;

import java.util.Scanner;

class Hourly extends Employee {
    private double hourlyRate;
    private double hours;

    public Hourly(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public void addHours(double hours) {
        this.hours += hours;
    }

    @Override
    public double getPay() {
        return hourlyRate * hours;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a taxa horária do funcionário:");
        this.hourlyRate = scanner.nextDouble();

        System.out.println("Digite o número de horas trabalhadas pelo funcionário:");
        this.hours = scanner.nextDouble();
    }
}