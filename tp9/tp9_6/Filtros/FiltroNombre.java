package tp9.tp9_6.Filtros;

import tp9.tp9_6.Comarca;

public class FiltroNombre extends Filtro{
    private String nombre;
    public FiltroNombre(String nombre){
        this.nombre = nombre;
    }
    
    public boolean cumple(Comarca c){
        return c.getNombre().equals(nombre);
    }
}
