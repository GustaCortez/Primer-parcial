import java.util.LinkedList;
import java.util.Queue;
public class PruebaSolicitudes {
    public static void main(String[] args) {
        GestorSolicitudes gestor = new GestorSolicitudes();

        // Agregar algunas solicitudes de ejemplo
        gestor.agregarSolicitud(new SolicitudSoporte(1, "Reparación de pantalla", "Cliente A"));
        gestor.agregarSolicitud(new SolicitudSoporte(2, "Soporte técnico", "Cliente B"));
        gestor.agregarSolicitud(new SolicitudSoporte(3, "Instalación de software", "Cliente C"));

        // Asignar solicitudes a técnicos
        SolicitudSoporte solicitud1 = gestor.asignarSolicitud();
        SolicitudSoporte solicitud2 = gestor.asignarSolicitud();
        SolicitudSoporte solicitud3 = gestor.asignarSolicitud();

        // Asignar una solicitud adicional (no debería haber más solicitudes disponibles)
        SolicitudSoporte solicitud4 = gestor.asignarSolicitud();
    }
}