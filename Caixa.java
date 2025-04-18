import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao;

        do {
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.print("Valor do saque: ");
                double saque = scanner.nextDouble();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado.");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else if (opcao == 3) {
                System.out.print("Valor do depósito: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado.");
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
