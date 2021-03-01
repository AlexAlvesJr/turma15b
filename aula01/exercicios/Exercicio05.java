package exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double custoFabrica, percentDistribuidor, impostos;
        
        System.out.println("Qual o custo de fábrica do automóvel?");
        custoFabrica = entrada.nextDouble();

        impostos = 0.45 * custoFabrica;
        percentDistribuidor = 0.28 * custoFabrica;

        System.out.println("O custo final ao consumidor é: " + "R$" + (custoFabrica + impostos + percentDistribuidor));
        System.out.println("O valor de impostos a ser pago é: " + "R$" + impostos);

        entrada.close();

    }
    
}
