package tp9.tp9_5.Comparadores;

import java.util.Comparator;

import tp9.tp9_5.Empleado;

public class ComparadorCantMensajes implements Comparator<Empleado> {
    public int compare(Empleado e1, Empleado e2){
        return e1.getCantMensajes()-e2.getCantMensajes();
    }
}
