import java.util.Scanner;
public class Questao4 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a porcentagem do IPI: ");
            double ipi = scanner.nextDouble();

            System.out.print("Código da peça 1: ");
            int codigo1 = scanner.nextInt();
            System.out.print("Valor unitário da peça 1: R$ ");
            double valor1 = scanner.nextDouble();
            System.out.print("Quantidade da peça 1: ");
            int quant1 = scanner.nextInt();

            System.out.print("Código da peça 2: ");
            int codigo2 = scanner.nextInt();
            System.out.print("Valor unitário da peça 2: R$ ");
            double valor2 = scanner.nextDouble();
            System.out.print("Quantidade da peça 2: ");
            int quant2 = scanner.nextInt();

            double valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
            System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);

            scanner.close();
        }
    }


