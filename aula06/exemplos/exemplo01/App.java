package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Armando", 3750);
        Funcionario f2 = new Funcionario();
        Gerente g = new Gerente("Ricardo", 3750, 16);

        //f.setNome("Armando");
        System.out.println("Funcionário: " + f);

        //g.setNome("Ricardo");
        System.out.println("Gerente: " + g);

        //g.setNumeroFuncionarios(26);
        System.out.println("O número de funcionários da gerência é: " + g.getNumeroFuncionarios());


        f.aumentoSalario(10);
        System.out.println("O novo salário do funcionário após o aumento é: " + f.getSalario());
        g.aumentoSalario(10);
        System.out.println("O novo salário do gerente após o aumento é: " + g.getSalario());
        
    }
    
}
