package uri;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1010 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        int p1, n1, p2, n2;
        double v1, v2, valorTotal;
        String t1, t2;
        
        t1 = entrada.nextLine();
        t2 = entrada.nextLine();
        String[] part1 = t1.split(" ");
        String[] part2 = t2.split(" ");
        
        Integer.parseInt(part1 [0]);
        n1 = Integer.parseInt(part1 [1]);
        v1 = Double.parseDouble(part1 [2]);
        p2 = Integer.parseInt(part2 [0]);
        n2 = Integer.parseInt(part2 [1]);
        v2 = Double.parseDouble(part2 [2]);

        valorTotal = (n1*v1)+(n2*v2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
        
        entrada.close();
 
    }
}