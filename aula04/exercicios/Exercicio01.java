package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {

        int resposta;

        resposta = parOuImpar(3);
        if(resposta == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
        
    }

    static int parOuImpar(int numero){
        int resultado;
        if(numero % 2 == 0){
            resultado = 0;
        } else {
            resultado = 1;
        }

        return resultado;
    }
    
}
