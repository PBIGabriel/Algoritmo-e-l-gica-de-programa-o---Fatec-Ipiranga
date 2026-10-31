import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];

        int p = 0;
        int im = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if (numeros[i] % 2 == 0) {
                pares[p] = numeros[i];
                p = p + 1;
            } else {
                impares[im] = numeros[i];
                im = im + 1;
            }
        }

        System.out.println("Numeros pares:");

        for (int i = 0; i < p; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("Numeros impares:");

        for (int i = 0; i < im; i++) {
            System.out.println(impares[i]);
        }

        teclado.close();
    }
}

