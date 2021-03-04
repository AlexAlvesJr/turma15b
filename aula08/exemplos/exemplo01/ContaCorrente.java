package exemplos.exemplo01;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int conta, double saldo){
        super(conta, saldo);

    }

    @Override
    public boolean deposito(double valor) {
        return super.deposito(valor - TAXA_DEPOSITO);
    }

    
    @Override
    public boolean saque(double valor) {
        if(valor <= getSaldo()){
            return super.saque(valor);
        }
        return false;
        }

    

    }
