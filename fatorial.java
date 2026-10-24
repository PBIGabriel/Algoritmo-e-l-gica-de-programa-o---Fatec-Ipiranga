import java.util.Scanner;

public class fatorial {

    static int fatorial(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Nao existe fatorial para numero negativo.");
        } else {
            long resultado = fatorial(numero);
            System.out.println("Fatorial de " + numero + " = " + resultado);
        }
    }
}

