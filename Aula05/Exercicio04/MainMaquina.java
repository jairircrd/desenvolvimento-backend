import java.util.ArrayList;
import java.util.List;

public class MainMaquina {
    public static void main(String[] args) {

        List<Maquina> maquinas = new ArrayList<>();

        maquinas.add(new Esteira("M001", "Esteira 1", "Ativa"));
        maquinas.add(new RoboIndustrial("M002", "Robô 1", "Ativo"));
        maquinas.add(new Prensa("M003", "Prensa 1", "Ativa"));

        for (Maquina maquina : maquinas) {
            maquina.operar();
        }
    }
}
