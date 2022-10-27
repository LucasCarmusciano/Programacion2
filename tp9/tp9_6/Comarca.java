package tp9.tp9_6;

import java.util.ArrayList;
import java.util.Comparator;

import tp9.tp9_6.Filtros.Filtro;

public class Comarca extends ElementoGeografico{
    private int superficie;
    private int cantHabitantes;
    private int monto;

    public Comarca(String nombre, int superficie, int cantHabitantes, int monto){
        super(nombre);
        this.superficie = superficie;
        this.cantHabitantes = cantHabitantes;
        this.monto = monto;
    }

    @Override
    public int getSuperficie() {
        return this.superficie;
    }

    @Override
    public int getCantHabitantes() {
        return this.cantHabitantes;
    }

    @Override
    public int getMonto() {
        return this.monto;
    }
    
    public ArrayList<Comarca> getListado(Filtro f, Comparator<Comarca> c){
        ArrayList<Comarca> lista = new ArrayList<>();
        if(f.cumple(this)){
            lista.add(this);
        }
        return lista;
    }

    public String toString(){
        return this.getNombre();
    }
}
