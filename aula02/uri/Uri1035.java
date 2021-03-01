package uri;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1035 {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d;
        
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();
        
        if((b > c) && (d > a) && (c+d)>(a+b) && (c > 0) && (d > 0) && (a%2==0)){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }

        entrada.close();
        
 
    }
 
}