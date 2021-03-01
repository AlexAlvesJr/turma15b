package exercicios.exercicio01;

public class Placar {
    private int gols1, gols2;
    private String time1, time2;

    public Placar(){
        this.time1 = "Time da casa";
        this.time2 = "Visitante";

    }

    public Placar(String time1, String time2){
        this.time1 = time1;
        this.time2 = time2;

    }

    public Placar(String time1, String time2, int gols1, int gols2){
        this.time1 = time1;
        this.time2 = time2;
        this.gols1 = gols1;
        this.gols2 = gols2;

    }

    public String getPlacar(){
        return time1 + " " + gols1 + " X " + gols2 + " " + time2;
    }
    
}
