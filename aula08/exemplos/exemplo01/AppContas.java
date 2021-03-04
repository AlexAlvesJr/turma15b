package exemplos.exemplo01;

import java.util.Scanner;


public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite;
        double valorDeposito;
        double valorSaque;
        ContaCorrente cc = null;
        ContaEspecial ce = null;

        GerenciaContas contas = new GerenciaContas();
        

        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Fazer depósito");
            System.out.println("5-Fazer saque");
            System.out.println("6-Verificar o saldo");
            System.out.println("7-Sair");
            System.out.print("==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta,0);                    
                    break;
                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da conta:");
                    limite = teclado.nextDouble();
                    contas.novaContaEspecial(numeroConta, 0, limite);
                    break;
                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaPoupanca(numeroConta, 0);
                    break;
                case 4:
                    System.out.println("Informe o valor do depósito:");
                    valorDeposito = teclado.nextDouble();
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
            
                    if(contas.deposito(numeroConta, valorDeposito)) {
                        System.out.println("Depósito realizado");
                    } else {
                        System.out.println("Falha na operação");
                    }

                    break;
                case 5:
                    System.out.println("Informe o valor do saque:");
                    valorSaque = teclado.nextDouble();
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();

                    if (contas.saque(numeroConta,valorSaque)) {
                        System.out.println("Saque realizado");
                    } else {
                    System.out.println("Falha na operação");
                    }

                    break;
                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println(contas.exibirSaldo(numeroConta));
                    break;  
                    
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Código inválido");
                    break;
            }

        } while(opcao != 7);

        

        teclado.close();
    }
    
}
