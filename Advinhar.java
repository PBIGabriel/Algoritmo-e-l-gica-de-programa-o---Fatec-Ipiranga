import java.util.Scanner;

public class Advinhar {

    static Scanner teclado = new Scanner(System.in);

    static void adivinharNumero(int numero) { int chute;

        do {
            System.out.print("Chute um numero: ");
            chute = teclado.nextInt();

            if (chute > numero) {
                System.out.println("É menor");
            } else if (chute < numero) {
                System.out.println("é maior");
            } else {
                System.out.println("É igual");
            }

        } while (chute != numero);
    }
    public static void main(String[] args) {
        System.out.print("Informe o numero secreto: ");
        int numero = teclado.nextInt();

        adivinharNumero(numero);
    }
}

