package exemplos.exemplo03;

public class Pessoa {
    // atributos
    String nome;
    Double salario;



    // métodos
    void apresentar() {
        System.out.println("olá, eu sou " + nome + " e eu ganho R$ " + salario);
    }

    // método construtor = inicializar o objeto
    Pessoa(String n, double s){
        nome = n;
        salario = s;
    }

}