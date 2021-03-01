package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alex", "1148252836");
        Estudante e1 = new Estudante("Alex", "1148252836", "Engenharia Mecânica");
        Professor p2 = new Professor("Adriano", "1148284629", 12500.55);

        System.out.println(p1);
        System.out.println(e1);
        System.out.println(p2);


    }
    
}
