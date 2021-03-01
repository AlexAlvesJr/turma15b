package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.println("Digite a nota1 do aluno:");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a nota2 do aluno:");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2)/2;
        System.out.println("**************");
        System.out.println("A nota final do aluno é: " + media);

        entrada.close();

    }
    
}
