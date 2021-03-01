package uri;

import java.util.Scanner;

public class uri1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x; 
        double y;
        
        x = entrada.nextInt();
        y = entrada.nextDouble();
        
        System.out.printf("%.3f", x/y);
        System.out.print(" km/l\n");
       
        
    entrada.close();

    }
    
}
