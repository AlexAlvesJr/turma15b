package exemplos;

public class Exemplo04 {

    public static void main(String[] args) {
        
        int numeroInt;
        double numeroDouble;
        
        numeroInt = 15;
        numeroDouble = 15;

        numeroInt = (int) numeroDouble; // casting = conversão
        
        System.out.println(numeroInt);
        System.out.println(numeroDouble);

        numeroDouble = 15 / 7;
        System.out.println(numeroDouble);

        numeroDouble = 15.0 / 7;
        System.out.println(numeroDouble);

        numeroDouble = (double)numeroInt / 7;
        System.out.println(numeroDouble);

    }
    
}
