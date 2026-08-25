package exercicio04;

public class Gerente extends Pessoa {

    private String departamento;
    private double salario;

    public Gerente(
        String codigo,
        String nome,
        String email,
        String departamento,
        double salario
    ) {
        super(codigo, nome, email);
        this.departamento = departamento;
        setSalario(salario);
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: o salário não pode ser negativo.");
        }
    }
}