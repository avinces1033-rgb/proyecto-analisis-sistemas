package sistema.gestor.eventos;

public class EventoFactory {
    public static Evento generarEvento(String tipo) {
        if (tipo.equalsIgnoreCase("Concierto")) {
            return new EventoConcierto();
        }
        if (tipo.equalsIgnoreCase("Conferencia")) {
            return new EventoConferencia();
        }
        return null;
    }
}
