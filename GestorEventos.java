package sistema.gestor.eventos;

import java.util.ArrayList;
import java.util.List;

public class GestorEventos {
    private List<IObservadorEvento> suscriptores = new ArrayList<>();

    public void suscribir(IObservadorEvento persona) {
        suscriptores.add(persona);
    }

    public void avisarSuscriptores(String mensaje) {
        for (IObservadorEvento p : suscriptores) {
            p.recibirNotificacion(mensaje);
        }
    }

    public void crearEvento(String tipo) {
        System.out.println("\n=== CREANDO EVENTO ===");
        
        Evento evento = EventoFactory.generarEvento(tipo);
        
        if (evento != null) {
            evento.describir();
            avisarSuscriptores("Nuevo evento disponible: " + tipo);
        } else {
            System.out.println("Error: Tipo de evento no existe.");
        }
    }

    public static void main(String[] args) {
        GestorEventos gestor = new GestorEventos();
        
        Asistente a1 = new Asistente("Maria");
        Asistente a2 = new Asistente("Luis");
        
        gestor.suscribir(a1);
        gestor.suscribir(a2);
        
        gestor.crearEvento("Concierto");
    }
}
