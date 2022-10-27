package tp9.tp9_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tp9.tp9_5.Filtros.Filtro;

public class GrupoEmpleados extends EntidadTrabajo{
    private ArrayList<EntidadTrabajo> entidades;
    private Filtro limite;
    
    public GrupoEmpleados(String nombre, Filtro limite){
        super(nombre);
        this.limite = limite;
        this.entidades = new ArrayList<>();
    }

    public void setLimite(Filtro limite){
        this.limite = limite;
    }

    public int getCantEmpleados() {
        return this.getEmpleados().size();
    }

    @Override
    public int getCantMensajes() {
        return this.getEmpleados().size();
    }

    @Override
    public void addNotificacion(Notificacion n) {
        if (this.limite.cumple(n)){
            for(int i=0; i<entidades.size(); i++){
                entidades.get(i).addNotificacion(n);;
            }
        }
    }

    public ArrayList<Empleado> getListadoEmpleados(Filtro f, Comparator<Empleado> c){
        ArrayList<Empleado> lista = new ArrayList<>();
        Empleado empleado;
        for(int i=0; i<getEmpleados().size(); i++){
            empleado = getEmpleados().get(i);
            if(!lista.contains(empleado)){
                if(empleado.aceptado(f)){
                    lista.add(empleado);
                }
            }
        }
        Collections.sort(lista, c);
        return lista;
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        for(int i=0; i<entidades.size(); i++){
            empleados.addAll(entidades.get(i).getEmpleados());
        }
        return empleados;
    }
}
