import java.util.Scanner;
public class Questao3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o saldo: R$ ");
            double saldo = scanner.nextDouble();

            double saldoReajustado = saldo * 1.01;
            System.out.printf("Saldo com reajuste de 1%%: R$ %.2f%n", saldoReajustado);

            scanner.close();
        }
    }


