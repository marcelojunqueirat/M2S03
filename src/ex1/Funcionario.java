package ex1;

public class Funcionario {
    private Long cpf;
    private String nomeCompleto;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(Long cpf, String nomeCompleto, Double salario) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
    }

    public void promover(double percentual){
        percentual /= 100;
        this.salario = this.salario + this.salario * percentual;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf= " + cpf +
                ", nomeCompleto= '" + nomeCompleto + '\'' +
                ", salario= " + salario +
                '}';
    }
}
