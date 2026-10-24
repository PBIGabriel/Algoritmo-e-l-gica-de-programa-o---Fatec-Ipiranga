import java.util.Scanner;

public class expoente {
    static int potencia(int base, int expoente) {
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base:");
        int base = teclado.nextInt();

        System.out.print("Digite o expoente:");
        int expoente = teclado.nextInt();

        if (expoente < 0) {
            System.out.println("Informe um expoente");
        } else {
            int resultado = potencia(base, expoente);
            System.out.println("Resultado: " + resultado);
        }
        teclado.close();
    }
}
