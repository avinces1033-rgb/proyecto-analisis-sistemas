package sistema.gestor.eventos;

public class EventoConcierto implements Evento {
    @Override
    public void describir() {
        System.out.println("Evento: Concierto de música en vivo programado.");
    }
}