package uri;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1006{

    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        double a, b, c, media;
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
 
        media = (2*a + 3*b + 5*c)/10;
        
        System.out.printf("MEDIA = %.1f\n", media);
                
        entrada.close();
 
    }
 
}