package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = entrada.nextInt();

        if (n > 20){
            System.out.println(n/2.0);
        }

        System.out.println("Final do programa");

        entrada.close();

    }
    
}
