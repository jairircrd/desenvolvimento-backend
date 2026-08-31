public class Maquina {
    protected String codigo;
    protected String nome;
    protected String status;

    public Maquina(String codigo, String nome, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
    }

    public void operar() {
        System.out.println("Máquina em operação.");
    }
}
