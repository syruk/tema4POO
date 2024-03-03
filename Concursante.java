import java.util.ArrayList;
import java.util.List;
class Concursante {
    private List<Premio> premiosObtenidos;

    public Concursante() {
        premiosObtenidos = new ArrayList<>();
    }

    public void agregarPremio(Premio premio) {
        premiosObtenidos.add(premio);
    }

    public List<Premio> getPremiosObtenidos() {
        return premiosObtenidos;
    }
}
