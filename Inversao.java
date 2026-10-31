import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[6];

        int aux;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < 3; i++) {

            aux = numeros[i];

            numeros[i] = numeros[5 - i];

            numeros[5 - i] = aux;
        }

        System.out.println("Vetor invertido:");

        for (int i = 0; i < 6; i++) {
            System.out.println(numeros[i]);
        }

        teclado.close();
    }
}

