package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numero;

        do { 
            System.out.println("Digite um valor inteiro menor que 10:");
        numero = in.nextInt();
        } while (numero >=10);


        in.close();
    }
    
}
