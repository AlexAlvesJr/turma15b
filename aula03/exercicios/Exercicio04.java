package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, soma, i;

        System.out.println("Insira o 1º número:");
        n = entrada.nextInt();
        soma = n;
        i = 1;

        while (n != 0){
            i = i + 1;
            System.out.println("Insira o " + i +"º número:");
            n = entrada.nextInt();
            soma = soma + n;   
        }
        
        System.out.println("A soma dos valores é: " + soma);

        entrada.close();
    }
    
}
