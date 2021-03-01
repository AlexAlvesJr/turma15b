package exercicios.exercicio4;

public class Relogio {
    private int hora, minuto, segundo;

public Relogio(int hora, int minuto, int segundo){
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
}

public void getHorario(){
    if(hora > -1 && hora < 24 && minuto > -1 && minuto < 60 && segundo > -1 && segundo < 60){
    System.out.println("*****************");
    System.out.printf("Horário: %02dh%02dm%02ds\n", hora, minuto, segundo);
    }
    else{
        System.out.println("*****************");
        System.out.println("Erro: lembre-se que a hora deve estar dentro do intervalo 0-23 e minutos/segundos dentro do intervalo 0-59!");
    }
}

}
