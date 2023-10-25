package ifpe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Média Aritmética");
            System.out.println("2. Média Ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    calcularMediaAritmetica(scanner);
                    break;
                case 2:
                    calcularMediaPonderada(scanner);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 3);
        
        scanner.close();
    }
    
    public static void calcularMediaAritmetica(Scanner scanner) {
        System.out.print("Quantos números deseja calcular a média aritmética? ");
        int n = scanner.nextInt();
        double soma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        
        double media = soma / n;
        System.out.println("Média Aritmética: " + media);
    }
    
    public static void calcularMediaPonderada(Scanner scanner) {
        System.out.print("Quantos valores você deseja calcular a média ponderada? ");
        int n = scanner.nextInt();
        double somaProdutos = 0;
        double somaPesos = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = scanner.nextDouble();
            System.out.print("Digite o peso para o valor " + i + ": ");
            double peso = scanner.nextDouble();
            
            somaProdutos += valor * peso;
            somaPesos += peso;
        }
        
        if (somaPesos == 0) {
            System.out.println("Não é possível calcular a média ponderada com pesos iguais a zero.");
        } else {
            double mediaPonderada = somaProdutos / somaPesos;
            System.out.println("Média Ponderada: " + mediaPonderada);
        }
    }
}
