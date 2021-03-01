package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    double salario, imposto, x;
        
    salario = entrada.nextDouble();
        
        if(salario <= 2000.00){
            System.out.println("Isento");
        }else if(salario <= 3000.00){
            x = salario - 2000.00;
            imposto = 0.08*x;
            System.out.printf("R$ %.2f\n", imposto);
        }else if(salario <= 4500.00){
            x = salario - 3000.00;
            imposto = 0.18*x + 0.08*(3000.00-2000.01);
            System.out.printf("R$ %.2f\n", imposto);
        }else{
            x = salario - 4500.00;
            imposto = 0.28*x + 0.08*(3000.00-2000.01) + 0.18*(4500.00-3000.01);
            System.out.printf("R$ %.2f\n", imposto);
        }
        
        entrada.close();
    }
}
