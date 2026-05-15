package sistema.gestor.eventos;

public class Asistente implements IObservadorEvento {
    private String nombre;

    public Asistente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Asistente " + nombre + ": " + mensaje);
    }
}
