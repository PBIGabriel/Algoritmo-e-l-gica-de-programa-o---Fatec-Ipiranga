
import java.util.Scanner;

public class MatrizTriangulo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[][] triangulos = new double[10][3];

        int equilateros = 0;
        int isoceles = 0;
        int escalenos = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("\nTriangulo " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o lado " + (j + 1) + ": ");
                triangulos[i][j] = teclado.nextDouble();
            }

            double a = triangulos[i][0];
            double b = triangulos[i][1];
            double c = triangulos[i][2];

            if (a == b && b == c) {
                equilateros++;

            } else if (a == b || a == c || b == c) {
                isoceles++;

            } else {
                escalenos++;
            }
        }

        double percentualEquilateros = (equilateros * 100.0) / 10;
        double percentualIsoceles = (isoceles * 100.0) / 10;
        double percentualEscalenos = (escalenos * 100.0) / 10;

        System.out.println("Resultados:");

        System.out.println("Equilateros: " +
                percentualEquilateros + "%");

        System.out.println("Isoceles: " +
                percentualIsoceles + "%");

        System.out.println("Escalenos: " +
                percentualEscalenos + "%");

        teclado.close();
    }
}
