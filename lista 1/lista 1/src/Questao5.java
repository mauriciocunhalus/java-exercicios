import java.util.Scanner;
public class Questao5 {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor do salário mínimo: R$ ");
            double salarioMinimo = scanner.nextDouble();

            System.out.print("Digite o valor do seu salário: R$ ");
            double salarioUsuario = scanner.nextDouble();

            double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
            System.out.printf("Você ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);

            scanner.close();
        }
    }

