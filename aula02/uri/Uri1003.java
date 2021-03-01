package uri;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1003 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        
        Scanner entrada = new Scanner(System.in);
        int soma, a, b;
        
        a = entrada.nextInt(); //Como é um exercício para um robô (Uri), não precisa pedir a entrada dos dados com sysout
        b = entrada.nextInt();
        soma = a + b;
        
        System.out.println("SOMA = " + soma);
        
        entrada.close();
    }
 
}