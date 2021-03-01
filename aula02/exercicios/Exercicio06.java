package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salário:");
        double salario = entrada.nextDouble();

        if(salario <= 600.00){
            System.out.println("Isento INSS");
        }else if(salario <= 1200.00){
            System.out.println("Desconto de 20% no INSS");
        }else if(salario <= 2000.00){
            System.out.println("Desconto de 25% no INSS");
        }else{
            System.out.println("Desconto de 30% no INSS");
        }

        entrada.close();

    }
    
}
