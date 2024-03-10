import java.util.LinkedList;
import java.util.Queue;

class GestorSolicitudes {
    private Queue<SolicitudSoporte> colaSolicitudes;

    public GestorSolicitudes() {
        colaSolicitudes = new LinkedList<>();
    }

    // Método para agregar una nueva solicitud a la cola
    public void agregarSolicitud(SolicitudSoporte solicitud) {
        colaSolicitudes.offer(solicitud);
        System.out.println("Solicitud agregada: " + solicitud.getId());
    }

    // Método para asignar la siguiente solicitud disponible a un técnico
    public SolicitudSoporte asignarSolicitud() {
        if (!colaSolicitudes.isEmpty()) {
            SolicitudSoporte solicitud = colaSolicitudes.poll();
            System.out.println("Solicitud asignada: " + solicitud.getId());
            return solicitud;
        } else {
            System.out.println("No hay solicitudes pendientes en este momento.");
            return null;
        }
    }
}

