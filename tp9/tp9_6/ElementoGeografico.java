package tp9.tp9_6;

import java.util.ArrayList;
import java.util.Comparator;

import tp9.tp9_6.Filtros.Filtro;

public abstract class ElementoGeografico {
    private String nombre;
    public  ElementoGeografico(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public abstract int getSuperficie();
    public abstract int getCantHabitantes();
    public abstract int getMonto();
    public abstract ArrayList<Comarca> getListado(Filtro f, Comparator<Comarca> c);

    public int getMontoPerCapita(){
        return (this.getMonto()/this.getCantHabitantes());
    }
    public int getDensidadPoblacion(){
        return (this.getCantHabitantes()/this.getSuperficie());
    }
}
