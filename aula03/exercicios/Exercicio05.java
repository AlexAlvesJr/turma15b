package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, par, impar;

        par = 0;
        impar = 0;
                
        for(int i = 1; i < 11; i++){
            System.out.println("Insira o " + i + "º número:");
            x = in.nextInt();
            if (x % 2 == 0){
                par++;
            } else {
                impar++;
            }
              
        }            

        System.out.println("O total de pares é: " + par);
        System.out.println("O total de ímpares é: " + impar);

        in.close();
    }
    
}
