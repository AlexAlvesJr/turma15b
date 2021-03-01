package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("São Paulo", "Santos");
        Placar p3 = new Placar("São Paulo", "Santos", 5, 1);

        System.out.println("Testando o placar 1: " + p1.getPlacar());
        System.out.println("Testando o placar 2: " + p2.getPlacar());
        System.out.println("Testando o placar 3: " + p3.getPlacar());
        

    }
    
}
