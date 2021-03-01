package exercicios.exercicio03;

public class AppContas {
    public static void main(String[] args) {


        ContaPoupanca conta = new ContaPoupanca(1234, 5000);
        conta.setTaxaDeSaque(0.15);

        if(conta.deposito(5000)){
            System.out.println("Depósito realizado");
            } else {
                System.out.println("Falha na operação");
            }
            
            System.out.println("Saldo atual: R$ " + conta.getSaldo());     
    
            
            if(conta.saque(5000)){
            System.out.println("Saque realizado");
            } else {
            System.out.println("Saque maior que o limite - não realizado");
            }
        
    
            System.out.println("Saldo atual: R$ " + conta.getSaldo()); 


        // Conta Especial
        /*
        ContaEspecial conta = new ContaEspecial(1234, 5000, 1000);

        if(conta.deposito(5000)){
            System.out.println("Depósito realizado");
            } else {
                System.out.println("Falha na operação");
            }
            
            System.out.println("Saldo atual: R$ " + conta.getSaldo());     
    
            
            if(conta.saque(10500)){
            System.out.println("Saque realizado");
            } else {
            System.out.println("Saque maior que o limite - não realizado");
            }
        
    
            System.out.println("Saldo atual: R$ " + conta.getSaldo()); 
            /*
            // Conta Especial





        // ContaCorrente
        /*
        Conta conta = new ContaCorrente(1234, 5000);

        if(conta.deposito(5000)){
        System.out.println("Depósito realizado");
        } else {
            System.out.println("Falha na operação");
        }
        
        System.out.println("R$ " + conta.getSaldo());     

        
        if(conta.saque(5000)){
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque não realizado");
        }

        System.out.println("R$ " + conta.getSaldo());  
        /*
        // ContaCorrente   
        

        
/*
        conta.saque(7600);
        if(conta.saque(7600) == 0){
            System.out.println("Não é possível sacar um valor maior que o saldo.");
        } else {
        System.out.println("O saldo é R$ : " + conta.getSaldo());
        }
*/

    }
    
}
