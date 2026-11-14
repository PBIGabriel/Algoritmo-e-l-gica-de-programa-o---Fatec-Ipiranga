import java.util.Scanner;

public class MatrizTemp {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[][] temperatura = new double[10][3];

        // Cadastro das temperaturas
        for (int i = 0; i < 10; i++) {

            System.out.println("Dia " + (i + 1));

            System.out.print("Temperatura minima: ");
            temperatura[i][0] = teclado.nextDouble();

            System.out.print("Temperatura maxima: ");
            temperatura[i][1] = teclado.nextDouble();

            // Calculando a media
            temperatura[i][2] = (temperatura[i][0] + temperatura[i][1]) / 2;
        }

        int opcao;

        do {
            System.out.println("Menu");
            System.out.println("1 - Temperatura minima de todos os dias");
            System.out.println("2 - Temperatura maxima de todos os dias");
            System.out.println("3 - Maior variacao de temperatura");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Dia " + (i + 1) +
                                ": " + temperatura[i][0] + " graus");
                    }
                    break;

                case 2:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Dia " + (i + 1) +
                                ": " + temperatura[i][1] + " graus");
                    }
                    break;

                case 3:
                    double maiorVariacao = 0;
                    int diaMaiorVariacao = 0;

                    for (int i = 0; i < 10; i++) {

                        double variacao = temperatura[i][1] - temperatura[i][0];

                        if (variacao > maiorVariacao) {
                            maiorVariacao = variacao;
                            diaMaiorVariacao = i + 1;
                        }
                    }

                    System.out.println("Maior variacao: " +
                            maiorVariacao + " graus");
                    System.out.println("Ocorreu no dia: " + diaMaiorVariacao);
                    break;

                case 4:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 4);

        teclado.close();
    }
}


