//exercício 1
import java.util.Scanner;

public class Main {

    static void tabuada(int numero) {int contador = 1;

        do {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        } while (contador <= 10);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = teclado.nextInt();

        tabuada(numero);
    }
}