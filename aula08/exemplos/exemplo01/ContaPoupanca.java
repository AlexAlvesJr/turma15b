package exemplos.exemplo01;

public class ContaPoupanca extends Conta{
    private static double taxaDeSaque;

    public ContaPoupanca(int conta, double saldo){
        super(conta, saldo);
    }

    public static void setTaxaDeSaque(double taxa){
        if(taxa > 0){
            taxaDeSaque = taxa;
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
