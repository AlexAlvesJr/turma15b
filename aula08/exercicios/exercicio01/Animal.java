package exercicios.exercicio01;

public class Animal {
    private String nome, raca, dataNascimento;
    private Proprietario proprietario;
    
    public Animal(String nome, String raca, String dataNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = new Proprietario();
    }

    /*
    public Animal(String nome, String raca, String dataNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = Proprietario(nome, telefone);
    }

    public Animal(String nome, String raca, String dataNascimento, String nomeProprietario, int telefone) {
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = Proprietario(nomeProprietario, telefone);
    }
    */

    @Override
    public String toString() {
        return nome + " : " + raca + " : " + dataNascimento + " : " + proprietario;
    }


    
}
