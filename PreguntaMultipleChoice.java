class PreguntaMultipleChoice implements Pregunta {
    private String pregunta;
    private String[] opciones;
    private int respuestaCorrectaIndex;

    public PreguntaMultipleChoice(String pregunta, String[] opciones, int respuestaCorrectaIndex) {
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.respuestaCorrectaIndex = respuestaCorrectaIndex;
    }

    @Override
    public boolean responder(String respuesta) {
        try {
            int respuestaIndex = Integer.parseInt(respuesta);
            return respuestaIndex == respuestaCorrectaIndex;
        } catch (NumberFormatException e) {
            System.out.println("Respuesta inválida. Debe ser un número.");
            return false;
        }
    }

    @Override
    public String obtenerPregunta() {
        StringBuilder sb = new StringBuilder();
        sb.append(pregunta).append("\n");
        for (int i = 0; i < opciones.length; i++) {
            sb.append(i + 1).append(". ").append(opciones[i]).append("\n");
        }
        return sb.toString();
    }
}
