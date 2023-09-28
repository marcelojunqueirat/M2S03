package ex2;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marcelo", 4000.0F);

        funcionario.aumentar(1000.0F);
        System.out.println(funcionario);

        funcionario.aumentar(500.0F,300.0F);
        System.out.println(funcionario);
    }
}
