package exercicios.exercicio3;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("GM", "Cruze", 13);
        Veiculo v2 = new Veiculo("VW", "Fox", 16);
        
        v1.exibir();
        System.out.println("O consumo do veículo é " + v1.apresentarConsumo() + " km/l");
        v2.exibir();
        System.out.println("O consumo do veículo é " + v2.apresentarConsumo() + " km/l");
    }
  
}
