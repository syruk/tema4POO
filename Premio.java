import java.util.ArrayList;
import java.util.List;
import java.util.Random;
class Premio {
    private List<String> premios;

    public Premio() {
        premios = new ArrayList<>();
        llenarPremios();
    }

    private void llenarPremios() {
        premios.add("Un peluche gigante");
        premios.add("Una suscripción de por vida a Netflix");
        premios.add("Un viaje todo incluido a las Bahamas");
        premios.add("Una pizza gigante");
        premios.add("Un vale para un concierto de tu banda favorita");
        premios.add("Una cena en un restaurante de lujo");
        premios.add("Un día de spa para dos personas");
        premios.add("Una caja de chocolates artesanales");
        premios.add("Un tour en globo aerostático");
        premios.add("Un libro autografiado por tu autor favorito");
        premios.add("Un masaje relajante");
        premios.add("Una sesión de cine en casa con palomitas ilimitadas");
        premios.add("Un curso de cocina gourmet");
        premios.add("Un paseo en lancha por el río");
        premios.add("Una visita VIP a un parque de atracciones");
        premios.add("Una tarde de pintura al aire libre");
        premios.add("Un concierto privado con tu artista favorito");
        premios.add("Una escapada de fin de semana a la montaña");
        premios.add("Un set de maquillaje profesional");
    }
    public String obtenerPremioAleatorio() {
        Random random = new Random();
        int indicePremio = random.nextInt(premios.size());
        return premios.get(indicePremio);
    }
}

