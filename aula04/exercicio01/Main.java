package exercicio01;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa(
            "EMP-001",
            "Tech Solutions Ltda",
            50
        );

        System.out.println("Código: " + empresa.getCodigo());
        System.out.println("Razão social: " + empresa.getRazaoSocial());
        System.out.println("Número de funcionários: " + empresa.getNumeroFuncionarios());

        empresa.setNumeroFuncionarios(-10);
    }
}