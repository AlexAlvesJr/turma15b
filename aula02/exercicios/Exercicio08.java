package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c;

        System.out.println("Digite os 3 comprimentos de lados:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if(a > (b+c) || b > (a+c) || c > (a+b)){
            System.out.println("A figura não é um triângulo");
        }else if(a==b && b==c){
            System.out.println("A figura é um triângulo equilátero");
        }else if(a==b || b==c || a==c){
            System.out.println("A figura é um triângulo isósceles");
        }else{
            System.out.println("A figura é um triângulo escaleno");
        }

        entrada.close();

    }
    
}
