package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestacao;

        System.out.println("Informe qual o salário bruto do estatutário:");
        salarioBruto = entrada.nextDouble();
        System.out.println("Agora, informe qual o valor da prestação a ser paga:");
        prestacao = entrada.nextDouble();

        if(prestacao <= 0.3*salarioBruto){
            System.out.println("Parabéns, seu crédito foi aprovado!");
        }else{
            System.out.println("Infelizmente, seu crédito não foi aprovado.");
        }

        entrada.close();

    }
    
}
