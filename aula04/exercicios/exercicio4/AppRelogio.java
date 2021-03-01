package exercicios.exercicio4;

import java.util.Scanner;

public class AppRelogio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Que horas são?");
        int hora = in.nextInt();
        System.out.println("Que minutos são?");
        int minuto = in.nextInt();
        System.out.println("Que segundos são?");
        int segundo = in.nextInt();
        
        Relogio relogio = new Relogio(hora, minuto, segundo);

        relogio.getHorario();

        in.close();
        
    }
    
}
