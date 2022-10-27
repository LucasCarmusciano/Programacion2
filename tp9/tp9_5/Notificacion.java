package tp9.tp9_5;

public class Notificacion {
    private String mensaje;
    private Empleado emisor;
    private int fecha;

    public Notificacion(String mensaje, Empleado emisor, int fecha){
        this.mensaje = mensaje;
        this.emisor = emisor;
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Empleado getEmisor() {
        return emisor;
    }

    public int getFecha() {
        return fecha;
    }
}
