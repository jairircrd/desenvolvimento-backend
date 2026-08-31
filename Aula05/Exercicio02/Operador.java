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
}
