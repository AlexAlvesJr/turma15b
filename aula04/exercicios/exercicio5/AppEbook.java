package exercicios.exercicio5;

import java.util.Scanner;

public class AppEbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        
        char funcao = 'z';
        int menu = 0;

        Ebook homodeus = new Ebook("Homo Deus", "Yuval Noah Harari", 443);

        while (menu != 3){
        System.out.println("Digite 1 para avançar até uma página, 2 para exibir as demais funções ou 3 para sair do menu:");
        menu = in2.nextInt();
            if( menu == 1) {
                System.out.println("Para qual página você deseja avançar?");
                int page = in3.nextInt(); 
                if (page < 444 && page > -1) {
                homodeus.irParaPagina(page);
                System.out.println("Indo até a página " + homodeus.getPagina());
                } else {
                    System.out.println("Inserir página válida");
                }
            } else if (menu == 2) {
                System.out.println("Insira a para avançar 1 página, r para retroceder 1 página, e para exibir em qual página você está, c para mostrar a capa ou x para sair");
                funcao = in.nextLine().charAt(0);
        
                if( funcao == 'a' ) {
                    if (homodeus.getPagina() == 443){
                        System.out.println("Você já está na última página!");
                    } else {
                        homodeus.avancarPagina();
                        System.out.println("Avançando para a página " + homodeus.getPagina());
                    } 
                }  else if ( funcao == 'r' ) {
                    if (homodeus.getPagina() == 0){
                        System.out.println("Você já está na capa!");
                    } else {
                        homodeus.retrocederPagina();
                        System.out.println("Retrocedendo para a página " + homodeus.getPagina());
                    }
                } else if (funcao == 'e') {
                        System.out.println("Você está na página " + homodeus.getPagina());
                } else if (funcao == 'c') {
                        homodeus.mostrarCapa();
                } else if (funcao == 'x') {
                        System.out.println("Saindo...");
                } else {
                        System.out.println("Valor inválido");
                }
            
            } else if (menu == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Digite um número válido");
            }
    }
        
        in.close();
        in2.close();
        in3.close();

        
    }
    
}
