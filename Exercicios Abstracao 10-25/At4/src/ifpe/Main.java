package ifpe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de funcionário (1 para Assalariado, 2 para Horista, 0 para sair):");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            }

            System.out.println("Digite o nome do funcionário:");
            String name = scanner.nextLine();

            if (choice == 1) {
                Salaried salariedEmployee = new Salaried(name, choice);
                salariedEmployee.insertData();
                employees.add(salariedEmployee);
            } else if (choice == 2) {
                Hourly hourlyEmployee = new Hourly(name, choice);
                hourlyEmployee.insertData();
                employees.add(hourlyEmployee);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        double totalPayroll = 0;
        for (Employee employee : employees) {
            totalPayroll += employee.getPay();
            employee.printPay();
        }

        System.out.println("Gasto total da empresa com a folha salarial: " + totalPayroll);
  
	}

}
