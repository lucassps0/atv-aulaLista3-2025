import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, i, contador = 0;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        for (i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        scanner.close();
    }
}
