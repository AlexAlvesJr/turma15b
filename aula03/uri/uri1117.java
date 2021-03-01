package uri;

import java.util.Scanner;

public class uri1117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        double soma = 0;
                    
        for(int i = 1; i < 3; i++){
            n = in.nextDouble();
            while(n > 10 || n < 0){
                System.out.println("nota invalida");
                n = in.nextDouble();
            } 
            soma = soma + n;
        }
        System.out.printf("media = %.2f\n", soma/2);
        
        in.close();
    }
    
}
