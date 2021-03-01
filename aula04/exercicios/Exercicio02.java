package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira 3 números:");
        int numero1 = in.nextInt();
        int numero2 = in.nextInt();
        int numero3 = in.nextInt();
        int resultado;
        
        
        resultado = numeros(numero1, numero2, numero3);
        System.out.println("O menor número é: " + resultado);

        in.close();
        }       
        
        static int numeros(int um, int dois, int tres){
            if(um <= dois && um <= tres){
                return um;
            } 
            
            if(dois <= um && dois <= tres){
                return dois;
            } 
            
            return tres;
        }
        
    }

        

