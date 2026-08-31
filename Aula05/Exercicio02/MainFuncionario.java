public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario operador = new Operador(
                "Carlos",
                "OP001",
                2500.0,
                10,
                30.0
        );

        Funcionario supervisor = new Supervisor(
                "Mariana",
                "SUP001",
                4000.0,
                800.0
        );

        System.out.println("Salário do operador: R$ " + operador.calcularSalario());
        System.out.println("Salário do supervisor: R$ " + supervisor.calcularSalario());
    }
}
