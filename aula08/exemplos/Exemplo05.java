package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numero;

    try{
        System.out.println("Digite um número inteiro: ");
        numero = Integer.parseInt(in.nextInt());
        System.out.println("Você digitou " + numero);
    } catch (InputMismatchException ex) {
        System.out.println("Você não digitou número inteiro");
    } catch (NumberFormatException ex) {
        System.out.println("Número inválido");
    } catch (Exception ex) {
        System.out.println("Erro: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        System.out.println("Fechando as conexões...");
        in.close();
    }

    System.out.println("Tchau");

   
    }

    
}
