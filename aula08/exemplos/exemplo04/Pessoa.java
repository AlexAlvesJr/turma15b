package exemplos.exemplo04;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome + " endereço" + endereco;
    }



    
}
