public class Operador extends Funcionario {
    private double horasExtras;
    private double valorHoraExtra;

    public Operador(String nome, String matricula, double salarioBase,
                    double horasExtras, double valorHoraExtra) {
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * valorHoraExtra);
    }

    @Override
public void exibirDados() {
    super.exibirDados();
    System.out.println("Horas extras: " + horasExtras);
    System.out.println("Valor da hora extra: R$ " + valorHoraExtra);
    }
}
