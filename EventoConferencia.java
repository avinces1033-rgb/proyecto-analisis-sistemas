package sistema.gestor.eventos;

public class EventoConferencia implements Evento {
    @Override
    public void describir() {
        System.out.println("Evento: Conferencia académica programada.");
    }
}