package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, media;

        System.out.println("Digite as notas do aluno");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        media = (0.4*n1 + 0.6*n2);
                
        if(media >= 6.0){
            System.out.println("Aluno aprovado!");
        } else{
            System.out.println("Aluno reprovado :(");
        }

        entrada.close();

    }
    
}
