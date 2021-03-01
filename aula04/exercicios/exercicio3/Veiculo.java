package exercicios.exercicio3;

public class Veiculo {
    String marca, modelo;
    double consumo;

    Veiculo(String marca, String modelo, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    void exibir(){
        System.out.println("O modelo é " + modelo + " e a marca é " + marca);
    }

    double apresentarConsumo(){
        return consumo;
    }
    
}
