package exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número");
        int n = entrada.nextInt();
        int i = 1;

        System.out.print("Sequência impressa: ");
        while(i <= n){
            System.out.print(i);
            i = i*2;
            if(i <= n){
                System.out.print(", ");
            }
        }
        System.out.println();
                  
        entrada.close();

    }
    
}
