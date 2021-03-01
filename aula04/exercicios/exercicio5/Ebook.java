package exercicios.exercicio5;

public class Ebook {
    private String titulo, autor;
    public int totalPaginas, paginaAtual;


public Ebook(String titulo, String autor, int totalPaginas){
    this.titulo = titulo;
    this.autor = autor;
    this.totalPaginas = totalPaginas;
    this.paginaAtual = 0; //iniciar na capa
}

public void avancarPagina(){
    this.paginaAtual = this.paginaAtual + 1;

}

public void retrocederPagina(){
    this.paginaAtual = this.paginaAtual - 1;

}

public void irParaPagina(int pagina){
    this.paginaAtual = pagina;
}

public int getPagina(){
    return paginaAtual;

}

public void mostrarCapa(){

    this.paginaAtual = 0;
    System.out.println("Autor: " + autor);
    System.out.println("Título: " + titulo);

}
    
}
