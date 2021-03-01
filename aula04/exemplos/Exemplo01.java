package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        linha2(30);
        System.out.println("Bom dia!");
        linha();

        linha2(15);
        linha2(25);

        int comprimento = 35;
        linha2(comprimento);

        linha3(20, '*');
        linha3(20, '#');


        
    }

    static void linha(){
        System.out.println("----------------");
    }

    static void linha2(int tamanho){ // tamanho = 25
        for(int i = 1; i < tamanho; i++){
        System.out.print("-");
        }
        System.out.println();
    }  
    
    static void linha3(int tamanho, char tipo){ // tamanho = 25
        for(int i = 1; i < tamanho; i++){
        System.out.print(tipo);
        }
        System.out.println();
    } 
    
}
