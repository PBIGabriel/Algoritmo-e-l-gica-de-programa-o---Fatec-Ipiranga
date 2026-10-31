
import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        int maior, menor, soma = 0;
        double media;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = teclado.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        for (int i = 0; i < 10; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            soma = soma + numeros[i];
        }

        media = soma / 10.0;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Media: " + media);

        teclado.close();
    }
}
