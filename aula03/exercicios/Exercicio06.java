package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, somaPares, somaMedia;
        final double LIMITE = 10;

        somaPares = 0;
        somaMedia = 0;

        for(int i = 1; i <= LIMITE; i++){
            System.out.println("Insira o " + i + "º número:");
            x = in.nextInt();            
            if(x % 2 == 0){
                somaPares = somaPares + 1;
                somaMedia = somaMedia + x;                
            }
        }

        if(somaPares > 0){
            System.out.println(somaMedia);
            System.out.println("A média dos valores pares é: " + somaMedia/somaPares);
            System.out.println("A porcentagem dos valores ímpares é: " + ((LIMITE - somaPares)/LIMITE)*100 + "%");
        }else{
            System.out.println("Não foi inserido nenhum número par");
        }       

        in.close();

    }
    
}
