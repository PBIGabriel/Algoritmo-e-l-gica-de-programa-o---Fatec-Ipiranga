import java.util.Scanner;

public class InscritosFatec {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] inscritos = new int[10][3];

        int quantidade = 0;
        int idadeTotal = 0;

        int[] cursos = new int[4];

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o CPF: ");
            int cpf = teclado.nextInt();

            boolean existe = false;

            for (int x = 0; x < quantidade; x++) {

                if (inscritos[x][0] == cpf) {
                    existe = true;
                }
            }

            if (existe) {

                System.out.println("CPF ja cadastrado. Registro nao inserido!");

            } else {

                System.out.print("Digite a idade: ");
                int idade = teclado.nextInt();

                System.out.println("1 - ADS");
                System.out.println("2 - GECOM");
                System.out.println("3 - Eventos");
                System.out.println("4 - RH");

                System.out.print("Escolha o curso: ");
                int curso = teclado.nextInt();

                inscritos[quantidade][0] = cpf;
                inscritos[quantidade][1] = idade;
                inscritos[quantidade][2] = curso;

                quantidade++;

                idadeTotal += idade;

                cursos[curso - 1]++;

                System.out.println("Cadastro realizado!");
            }
        }

        System.out.println(" INSCRITOS POR CURSO:");

        System.out.println("ADS: " + cursos[0]);
        System.out.println("GECOM: " + cursos[1]);
        System.out.println("Eventos: " + cursos[2]);
        System.out.println("RH: " + cursos[3]);

        if (quantidade > 0) {

            double media = (double) idadeTotal / quantidade;

            System.out.println("\nMedia de idade: " + media);

        } else {

            System.out.println("Nenhum inscrito cadastrado.");
        }

        teclado.close();
    }
}

