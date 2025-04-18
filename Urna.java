import java.util.Scanner;
public class Urna {
    public static void main(String[] args) {
        Scanner leitorVotos = new Scanner(System.in);
        int jair = 0, carlos = 0, neves = 0, nulo = 0, branco = 0, total = 0;
        int voto = 0;

        while (voto != 6) {
            System.out.println("1 - Candidato Jair Rodrigues");
            System.out.println("2 - Candidato Carlos Luz");
            System.out.println("3 - Candidato Neves Rocha");
            System.out.println("4 - Nulo");
            System.out.println("5 - Branco");
            System.out.println("6 - Encerrar votação");
            System.out.print("Digite seu voto: ");

            if (leitorVotos.hasNextInt()) {
                voto = leitorVotos.nextInt();

                switch (voto) {
                    case 1 -> { jair++; total++; }
                    case 2 -> { carlos++; total++; }
                    case 3 -> { neves++; total++; }
                    case 4 -> { nulo++; total++; }
                    case 5 -> { branco++; total++; }
                    case 6 -> System.out.println("Votação encerrada.");
                    default -> System.out.println("Voto inválido.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número de 1 a 6.");
                leitorVotos.next();
            }
        }
        System.out.println("Jair Rodrigues: " + jair + " votos");
        System.out.println("Carlos Luz: " + carlos + " votos");
        System.out.println("Neves Rocha: " + neves + " voto");
        System.out.println("Nulos: " + nulo + " votos");
        System.out.println("Brancos: " + branco + " votos");
        System.out.println("Total de votos: " + total);

        if (total > 0) {
            double porcNulo = (nulo * 100.0) / total;
            double porcBranco = (branco * 100.0) / total;
            System.out.printf("Porcentagem de votos nulos: %.2f\n", porcNulo);
            System.out.printf("Porcentagem de votos brancos: %.2f\n", porcBranco);
        }

        if (jair > carlos && jair > neves) {
            System.out.println("Vencedor: Jair Rodrigues");
        } else if (carlos > jair && carlos > neves) {
            System.out.println("Vencedor: Carlos Luz");
        } else if (neves > jair && neves > carlos) {
            System.out.println("Vencedor: Neves Rocha");
        } else {
            System.out.println("Empate entre os candidatos.");
        }

        leitorVotos.close();
    }
}
