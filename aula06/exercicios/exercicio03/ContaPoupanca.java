package exercicios.exercicio03;

public class ContaPoupanca extends Conta{
    private double taxaDeSaque;

    public ContaPoupanca(int conta, double saldo){
        super(conta, saldo);
    }

    public void setTaxaDeSaque(double taxaDeSaque){
        if(taxaDeSaque > 0){
            this.taxaDeSaque = taxaDeSaque;
        }
    }

    @Override
    public boolean saque(double valor) {
        if( getSaldo() >= valor+taxaDeSaque ){
            return super.saque(valor + taxaDeSaque);
        }
        return false;
    }
    
}
