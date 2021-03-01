package uri;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1048 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        double salario, salarion;
        
        salario = entrada.nextDouble();
        
        if(salario <= 400.00){
            salarion = salario*1.15;
            System.out.printf("Novo salario: %.2f\n", salarion);
            System.out.printf("Reajuste ganho: %.2f\n", 0.15*salario);
            System.out.println("Em percentual: 15 %");
        }else if(salario <= 800.00){
            salarion = salario*1.12;
            System.out.printf("Novo salario: %.2f\n", salarion);
            System.out.printf("Reajuste ganho: %.2f\n", 0.12*salario);
            System.out.println("Em percentual: 12 %");
        }else if(salario <= 1200.00){
            salarion = salario*1.10;
            System.out.printf("Novo salario: %.2f\n", salarion);
            System.out.printf("Reajuste ganho: %.2f\n", 0.10*salario);
            System.out.println("Em percentual: 10 %");
        }else if(salario <= 2000.00){
            salarion = salario*1.07;
            System.out.printf("Novo salario: %.2f\n", salarion);
            System.out.printf("Reajuste ganho: %.2f\n", 0.07*salario);
            System.out.println("Em percentual: 7 %");
        }else{
            salarion = salario*1.04;
            System.out.printf("Novo salario: %.2f\n", salarion);
            System.out.printf("Reajuste ganho: %.2f\n", 0.04*salario);
            System.out.println("Em percentual: 4 %");
        }
        
        entrada.close();
 
    }
 
}