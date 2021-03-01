package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, qtdeKw, valorKw, valorKwSoma;

        System.out.println("Informe, nesta ordem, o valor do salário mínimo e a quantidade de kw consumida: ");
        salarioMinimo = entrada.nextDouble();
        qtdeKw = entrada.nextDouble();
        
        valorKw = (1.0/500)*salarioMinimo;
        valorKwSoma = valorKw*qtdeKw;

        System.out.println("O valor de cada kw é: " + "R$" + valorKw);
        System.out.println("O valor total é: " + "R$" + valorKwSoma);
        System.out.println("O valor total a ser pago com desconto é: " + "R$" + valorKwSoma*0.85);

        entrada.close();

    }
}
