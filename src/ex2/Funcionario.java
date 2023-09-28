package ex2;

public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentar(float valor){
        this.salario += valor;
    }

    public void aumentar(float valor, float comissao){
        this.salario = this.salario + valor + comissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome= '" + nome + '\'' +
                ", salario= " + salario +
                '}';
    }
}
