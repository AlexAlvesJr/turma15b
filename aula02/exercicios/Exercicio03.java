package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x, y;

        System.out.println("Digite 2 números");
        x = entrada.nextFloat();
        y = entrada.nextFloat();

        if(x > y){
            System.out.print(x + " ");
            System.out.print(y);
            
        }
        else(y > x){
            System.out.print(y + " ");
            System.out.print(x);

        }

        entrada.close();

    }
    
}
