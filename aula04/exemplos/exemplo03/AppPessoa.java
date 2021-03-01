package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Alex", 5000); // instanciando um objeto do tipo pessoa
        Pessoa p2 = new Pessoa("Isa", 6000); // instanciando outro objeto do tipo pessoa

        p.apresentar();
        
        p2.apresentar();

    }
    
}
