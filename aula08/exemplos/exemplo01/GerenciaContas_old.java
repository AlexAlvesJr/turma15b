package exemplos.exemplo01;

import java.util.ArrayList;

public class GerenciaContas_old {
    private ArrayList<Conta> listaDeContas;

    public GerenciaContas_old() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(int conta, double saldo){
        listaDeContas.add(new ContaCorrente(conta, saldo));
    }

    public void novaContaEspecial(int conta, double saldo, double limite){
        listaDeContas.add(new ContaEspecial(conta, saldo, limite));
    }

    public void novaContaPoupanca(int conta, double saldo){
        listaDeContas.add(new ContaPoupanca(conta, saldo));
    }

    public boolean deposito(int numeroConta, double valorDeposito) {
        for (Conta conta : listaDeContas) { 
            if(conta.getConta() == numeroConta) {  
                return conta.deposito(valorDeposito);
                }
            }
            return false; // informa que não encontrou a conta
        }

    public boolean saque(int numeroConta, double valorSaque) {
        for (Conta conta : listaDeContas) { 
            if(conta.getConta() == numeroConta) {                 
                return conta.saque(valorSaque);        
            }
        }
        return false; // não achou a conta
    }

    public String exibirSaldo(int numeroConta) {
        for (Conta conta : listaDeContas) {
            if(conta.getConta() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta não encontrada";
    }

}

    

