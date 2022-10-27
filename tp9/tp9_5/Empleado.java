package tp9.tp9_5;

import java.util.ArrayList;

import tp9.tp9_5.Filtros.Filtro;

public class Empleado extends EntidadTrabajo{
    private int edad;
    private int legajo;
    private ArrayList<Notificacion> notificaciones;
    
    public Empleado(String nombre, int edad, int legajo){
        super(nombre);
        this.edad = edad;
        this.legajo = legajo;
        this.notificaciones = new ArrayList<>();
    }
    
    public int getEdad() {
        return edad;
    }
    public int getLegajo() {
        return legajo;
    }

    @Override
    public int getCantMensajes() {
        return notificaciones.size();
    }

    @Override
    public void addNotificacion(Notificacion n) {
        this.notificaciones.add(n);
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        ArrayList<Empleado> empleado = new ArrayList<>();
        empleado.add(this);
        return empleado;
    }

    public boolean equals(Object o){
        try{
            Empleado otro = (Empleado) o;
            return otro.getNombre().equals(this.getNombre());
        }catch(Exception e){
            return false;
        }
    }

    public boolean aceptado(Filtro f){
        for(int i=0; i<notificaciones.size(); i++){
            if(f.cumple(notificaciones.get(i))){
                return true;
            }
        }
        return false;
    }
}
