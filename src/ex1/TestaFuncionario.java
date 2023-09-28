package ex1;

public class TestaFuncionario {
    public static void main(String[] args) {
        var funcionario = new Funcionario(66633399901L, "Marcelo", 5000.0 );
        funcionario.promover(23);
        System.out.println(funcionario);
    }
}
