import java.util.Scanner;

public class Campeonato {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] times = new int[10][4];

        for (int i = 0; i < 10; i++) {

            System.out.println("Time " + (i + 1));

            System.out.print("Quantidade de vitorias: ");
            times[i][0] = teclado.nextInt();

            System.out.print("Quantidade de empates: ");
            times[i][1] = teclado.nextInt();

            System.out.print("Quantidade de derrotas: ");
            times[i][2] = teclado.nextInt();

            times[i][3] = (times[i][0] * 3) + times[i][1];
        }

        for (int i = 0; i < 9; i++) {

            for (int x = i + 1; x < 10; x++) {

                if (times[i][3] < times[x][3]) {

                    for (int a = 0; a < 4; a++) {

                        int aux = times[i][a];

                        times[i][a] = times[x][a];

                        times[x][a] = aux;
                    }
                }
            }
        }

        System.out.println("\n--- CLASSIFICACAO FINAL ---");

        for (int i = 0; i < 3; i++) {

            System.out.println((i + 1) + " Lugar");

            System.out.println("Vitorias: " + times[i][0]);

            System.out.println("Empates: " + times[i][1]);

            System.out.println("Derrotas: " + times[i][2]);

            System.out.println("Pontos: " + times[i][3]);
        }

        teclado.close();
    }
}