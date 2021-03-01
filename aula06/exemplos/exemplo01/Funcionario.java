package exemplos.exemplo01;

public class Funcionario {
    
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        
    }

    public Funcionario(){

    }


    /* public void setNome(String nome){
        this.nome = nome;
    }
    */

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    @Override
    public String toString(){
        return nome + ": " + salario;
    } 

    public void aumentoSalario(double x){
        salario = (1+x/100)*salario;
    }


}