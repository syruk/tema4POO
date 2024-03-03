import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Concurso {
    private Casilla[][] cuadricula;
    private Concursante concursante;
    private List<Pregunta> preguntas;

    public Concurso() {
        preguntas = new ArrayList<>();
        inicializarPreguntas();
        cuadricula = new Casilla[10][10]; // Mover la inicialización aquí
        concursante = new Concursante();
        inicializarCuadricula();
    }

    // Inicializar la cuadrícula con preguntas y premios aleatorios
    private void inicializarCuadricula() {
        Random random = new Random();
        int numPreguntas = preguntas.size(); // Obtener el número de preguntas
        if (numPreguntas > 0) { // Verificar que haya al menos una pregunta
            for (int i = 0; i < cuadricula.length; i++) {
                for (int j = 0; j < cuadricula[i].length; j++) {
                    Pregunta pregunta = preguntas.get(random.nextInt(numPreguntas));
                    Premio premio = new Premio();
                    cuadricula[i][j] = new Casilla(pregunta, premio);
                }
            }
        } else {
            System.out.println("No hay preguntas disponibles para inicializar la cuadrícula.");
        }
    }

    // Inicializar la lista de preguntas de cultura general
    private void inicializarPreguntas() {
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es la capital de Francia?",
                new String[]{"Madrid", "París", "Londres"}, 2));
        preguntas.add(new PreguntaMultipleChoice("¿Quién escribió Don Quijote de la Mancha?",
                new String[]{"Miguel de Cervantes", "Garcilaso de la Vega", "Lope de Vega"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el río más largo del mundo?",
                new String[]{"Amazonas", "Nilo", "Mississippi"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el río más largo de Europa?",
                new String[]{"Volga", "Danubio", "Rin"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es la capital de Australia?",
                new String[]{"Melbourne", "Sidney", "Canberra"}, 2));
        preguntas.add(new PreguntaMultipleChoice("¿Quién pintó La última cena?",
                new String[]{"Leonardo da Vinci", "Miguel Ángel", "Pablo Picasso"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿En qué año cayó el Muro de Berlín?",
                new String[]{"1985", "1989", "1991"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el metal más abundante en la corteza terrestre?",
                new String[]{"Hierro", "Aluminio", "Oro"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el órgano más grande del cuerpo humano?",
                new String[]{"Cerebro", "Piel", "Hígado"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿En qué país nació Albert Einstein?",
                new String[]{"Alemania", "Suiza", "Austria"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Qué año se descubrió América?",
                new String[]{"1492", "1498", "1504"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Quién escribió el poema épico La Ilíada?",
                new String[]{"Homero", "Virgilio", "Ovidio"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Cuántas patas tiene una araña?",
                new String[]{"6", "8", "10"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es la montaña más alta del mundo?",
                new String[]{"Monte Everest", "Monte Kilimanjaro", "Monte McKinley"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el planeta más grande del sistema solar?",
                new String[]{"Júpiter", "Saturno", "Urano"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es la hormona masculina predominante?",
                new String[]{"Estrógeno", "Testosterona", "Progesterona"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Quién escribió el Quijote?",
                new String[]{"Cervantes", "Garcilaso", "Lope de Vega"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es la capital de Japón?",
                new String[]{"Pekín", "Seúl", "Tokio"}, 2));
        preguntas.add(new PreguntaMultipleChoice("¿Qué animal puede dormir durante tres años seguidos?",
                new String[]{"Oso pardo", "Murciélago", "Pulpo"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el océano más grande del mundo?",
                new String[]{"Atlántico", "Pacífico", "Índico"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es la velocidad de la luz?",
                new String[]{"300,000 km/s", "200,000 km/s", "400,000 km/s"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Qué instrumento toca Kenny G?",
                new String[]{"Saxofón", "Piano", "Guitarra"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿En qué país se encuentra la torre de Pisa?",
                new String[]{"Italia", "Francia", "España"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el animal más rápido del mundo?",
                new String[]{"Leopardo", "Guepardo", "León"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Quién pintó la Mona Lisa?",
                new String[]{"Van Gogh", "Leonardo da Vinci", "Picasso"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el metal más pesado?",
                new String[]{"Oro", "Hierro", "Plomo"}, 2));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el país más grande del mundo?",
                new String[]{"Rusia", "China", "Estados Unidos"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el ácido presente en los limones?",
                new String[]{"Ácido cítrico", "Ácido clorhídrico", "Ácido sulfúrico"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿En qué año comenzó la Segunda Guerra Mundial?",
                new String[]{"1939", "1941", "1945"}, 0));
        preguntas.add(new PreguntaMultipleChoice("¿Quién escribió Romeo y Julieta?",
                new String[]{"Miguel de Cervantes", "William Shakespeare", "Jane Austen"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el metal más caro?",
                new String[]{"Platino", "Oro", "Rodio"}, 2));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el ave más grande del mundo?",
                new String[]{"Cóndor", "Avestruz", "Águila"}, 1));
        preguntas.add(new PreguntaMultipleChoice("¿Cuál es el océano más profundo del mundo?",
                new String[]{"Atlántico", "Pacífico", "Índico"}, 1));
    }

    public void elegirCasilla(int fila, int columna, String respuesta) {
        Casilla casilla = cuadricula[fila][columna];
        if (!casilla.isRespondida()) {
            if (casilla.responderPregunta(respuesta)) {
                concursante.agregarPremio(casilla.getPremio());
            }
        }
    }

    public List<Premio> mostrarPremiosObtenidos() {
        return concursante.getPremiosObtenidos();
    }

    // Método principal para iniciar el concurso
    public static void main(String[] args) {
        Concurso concurso = new Concurso();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce la fila y columna de la casilla (0-9) separadas por espacio:");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            System.out.println(concurso.cuadricula[fila][columna].pregunta.obtenerPregunta());
            System.out.println("Introduce tu respuesta:");
            String respuesta = scanner.next();

            concurso.elegirCasilla(fila, columna, respuesta);

            System.out.println("¿Quieres seguir jugando? (s/n)");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Premios obtenidos: ");
        List<Premio> premios = concurso.mostrarPremiosObtenidos();
        for (Premio premio : premios) {
            System.out.println(premio.obtenerPremioAleatorio());
        }
    }
}