import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha = 1234;
        int senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.nextInt();

        while ( senhaDigitada != senha) {
            System.out.println("Senha Incorreta.");
            System.out.print("Digite a senha novamente: ");
            senhaDigitada = scanner.nextInt();
        }

        System.out.println("Senha Correta.");
        scanner.close();
    }
}
