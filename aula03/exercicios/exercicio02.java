package exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int x, cont;

        cont = 0;
            
        System.out.println("Digite um número");
        x = entrada.nextInt();

        while(cont < 11){
            System.out.println(x + " x " + cont + " = " + x*cont);
            cont++;
        }

        entrada.close();
    }
    
}
