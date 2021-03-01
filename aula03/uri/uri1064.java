package uri;

import java.util.Scanner;

public class uri1064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n, soma;
        int positivo;

        positivo = 0;
        soma = 0;
        
        for(int i = 1; i < 7; i++){
            n = in.nextDouble();
            if(n > 0){
                positivo = positivo + 1;
                soma = soma + n;
            }
        }
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f\n", soma/positivo);
        
        in.close();


    }
    
}
