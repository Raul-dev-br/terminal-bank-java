import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Cliente johnDoe = new Cliente("Jhon Doe", "548.328.203-66");
        Conta contaUm = new Conta(123, johnDoe);
        boolean executando = true;

        while(executando){
            System.out.println("===================================");
            System.out.println("   Terminal Bank made in Java");
            System.out.println("===================================");
            System.out.println("(1) - Consultar Saldo");
            System.out.println("(2) - Depositar");
            System.out.println("(3) - Sacar");
            System.out.println("(4) - Sair");
            System.out.println("\n Escolha uma opção: ");

            int opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nSaldo Atual: " + contaUm.getSaldo() + "\n\n");
                    break;
                case 2:
                    leitor.nextLine();
                    System.out.println("\nDigite o valor que deseja depositar: ");
                    double valorDeposito = leitor.nextDouble();
                    contaUm.depositar(valorDeposito);
                    System.out.println("Valor depositado com sucesso!");
                    break;
                case 3:
                    leitor.nextLine();
                    System.out.println("\nDigite o valor que deseja sacar: ");
                    double valorSaque = leitor.nextDouble();
                    if(contaUm.sacar(valorSaque)){
                        System.out.println("Saque Realizado com Sucesso!");
                    } else {
                        System.out.println("Saldo Insuficiente!");
                    }
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Não houve um valor existente escolhido!");
                    System.out.println("Deseja continuar novamente? (s/n): ");
                    char continuar = leitor.next().charAt(0);
                    if(continuar == 'n'){
                        executando = false;
                    }
                    break;
            }
        }

        leitor.close();
    }
}
