package exemplos.exemplo01;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> mapaDeContas;

    public GerenciaContas() {
        mapaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int conta, double saldo){
        mapaDeContas.put(conta,new ContaCorrente(conta, saldo));
    }

    public void novaContaEspecial(int conta, double saldo, double limite){
        mapaDeContas.put(conta,new ContaEspecial(conta, saldo, limite));
    }

    public void novaContaPoupanca(int conta, double saldo){
        mapaDeContas.put(conta,new ContaPoupanca(conta, saldo));
    }

    public boolean deposito(int numeroConta, double valorDeposito) {
        Conta conta = mapaDeContas.get(numeroConta);
        
            if(conta != null) {  
                return conta.deposito(valorDeposito);
                }
            return false; // informa que não encontrou a conta
    }

    public boolean saque(int numeroConta, double valorSaque) {
        Conta conta = mapaDeContas.get(numeroConta);

            if(conta != null) {                 
                return conta.saque(valorSaque);        
            }
        return false; // não achou a conta
    }

    public String exibirSaldo(int numeroConta) {
        Conta conta = mapaDeContas.get(numeroConta);

            if(conta != null){
                return conta.toString();
            }
        return "Conta não encontrada";
    }

}

    

