class Casilla {
    Pregunta pregunta;
    private Premio premio;
    private boolean respondida;

    public Casilla(Pregunta pregunta, Premio premio) {
        this.pregunta = pregunta;
        this.premio = premio;
        this.respondida = false;
    }

    public boolean isRespondida() {
        return respondida;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public void setRespondida(boolean respondida) {
        this.respondida = respondida;
    }

    public boolean responderPregunta(String respuesta) {
        respondida = true;
        return pregunta.responder(respuesta);
    }

    public String mostrarPremio() {
        return premio.obtenerPremioAleatorio();
    }
}

