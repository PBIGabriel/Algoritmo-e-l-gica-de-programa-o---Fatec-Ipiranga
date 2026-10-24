import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saldo = 1000.00;
        double valor;
        int opcao;
        String continuar;
        do {
            System.out.println("\n CAIXA ELETRONICO");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Valor do saque: R$ ");
                    valor = teclado.nextDouble();

                    if (valor > 0 && valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Valor invalido ou saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.print("Valor do deposito: R$ ");
                    valor = teclado.nextDouble();

                    if (valor > 0) {
                        saldo += valor;
                        System.out.println("Deposito realizado.");
                    } else {
                        System.out.println("Valor invalido.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

            if (opcao != 4) {
                System.out.print("Deseja continuar? (S/N): ");
                continuar = teclado.next();
            } else {
                continuar = "N";
            }

        } while (continuar.equalsIgnoreCase("S"));

        teclado.close();
    }
}

