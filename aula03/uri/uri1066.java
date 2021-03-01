package uri;

import java.util.Scanner;

public class uri1066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, par, impar, positivo, negativo;
        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;
        
        for(int i = 1; i < 6; i++){
            x = in.nextInt();
            if(x % 2 == 0){
                par = par + 1;
            } else {
                impar = impar + 1;
            }
            if(x > 0){
                positivo = positivo + 1;
            } else if (x < 0) {
                negativo = negativo + 1;
            }
            
        }
        
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
        
        in.close();
    }
    
}
