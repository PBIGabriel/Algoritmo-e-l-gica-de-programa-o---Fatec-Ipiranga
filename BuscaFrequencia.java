 import java.util.Scanner;

public class BuscaFrequencia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[8];

        int busca, frequencia = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Digite o numero que deseja buscar: ");
        busca = teclado.nextInt();

        for (int i = 0; i < 8; i++) {

            if (numeros[i] == busca) {
                System.out.println("Encontrado no indice: " + i);

                frequencia = frequencia + 1;
            }
        }

        if (frequencia > 0) {
            System.out.println("Numero encontrado!");
            System.out.println("Frequencia: " + frequencia);
        } else {
            System.out.println("Numero nao encontrado!");
        }

        teclado.close();
    }
}

