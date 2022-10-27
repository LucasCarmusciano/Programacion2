package tp9.tp9_5;

import java.util.ArrayList;

public abstract class EntidadTrabajo {
    private String nombre;
    
    public EntidadTrabajo(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    abstract int getCantMensajes();
    abstract void addNotificacion(Notificacion n);
    abstract ArrayList<Empleado> getEmpleados();
}
