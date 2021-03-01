package exercicios.exercicio03;

public abstract class Conta {
    private double saldo;
    private int conta;

    public Conta(int conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }


    public boolean deposito(double valor){
        if(valor > 0){
        saldo += valor;
        return true;
        }
        return false;
    
    }

    public boolean saque(double valor){
        if(valor > 0){
        saldo -= valor;
        return true;
        }
        return false;
        }

    @Override
    public String toString() {
        return "Conta: " + conta + " : saldo: R$" + saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    
}
