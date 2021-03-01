package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double notaMedia = 0;
        double mediaTurma = 0;
        double mediaGeral = 0;
        final int nAlunos = 3;
        final int nTurmas = 2;

        for(int i = 1; i <= nTurmas; i++){
            for(int j = 1; j <= nAlunos; j++){
                System.out.println("Insira a média do aluno " + j + ":");
                notaMedia = notaMedia + in.nextDouble();
            }
            mediaTurma = (notaMedia/nAlunos);
            mediaGeral = mediaGeral + mediaTurma;
            notaMedia = 0;
            System.out.printf("A média da turma %d é %.2f\n", i, mediaTurma);
            
        }
    System.out.printf("A média geral das turmas é %.2f\n", mediaGeral/nTurmas);

    }   
    

}
