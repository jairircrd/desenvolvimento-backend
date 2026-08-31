public class RoboIndustrial extends Maquina {

    public RoboIndustrial(String codigo, String nome, String status) {
        super(codigo, nome, status);
    }

    @Override
    public void operar() {
        System.out.println(nome + ": realizando operação de montagem.");
    }
}
