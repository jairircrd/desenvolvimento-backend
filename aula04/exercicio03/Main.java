package exercicio03;

public class Main {

    public static void main(String[] args) {

        Consultor consultor = new Consultor(
            "CON-0089",
            "Ricardo",
            "jairircrd@gmail.com",
            3
        );

        System.out.println("Código: " + consultor.getCodigo());
        System.out.println("Nome: " + consultor.getNome());
        System.out.println("E-mail: " + consultor.getEmail());
        System.out.println(
            "Anos de experiência: " + consultor.getAnosExperiencia()
        );

        consultor.setAnosExperiencia(-4);
    }
}