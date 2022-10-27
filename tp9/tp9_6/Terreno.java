package tp9.tp9_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tp9.tp9_6.Filtros.Filtro;

public class Terreno extends ElementoGeografico{
    private ArrayList<ElementoGeografico> elementos;
    
    public Terreno(String nombre){
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoGeografico e){
        this.elementos.add(e);
    }
    @Override
    public int getSuperficie() {
        int total = 0;
        for(int i=0; i<this.elementos.size(); i++){
            total += this.elementos.get(i).getSuperficie();
        }
        return total;
    }

    @Override
    public int getCantHabitantes() {
        int total = 0;
        for(int i=0; i<this.elementos.size(); i++){
            total += this.elementos.get(i).getCantHabitantes();
        }
        return total;
    }

    @Override
    public int getMonto() {
        int total = 0;
        for(int i=0; i<this.elementos.size(); i++){
            total += this.elementos.get(i).getMonto();
        }
        return total;
    }

    public ArrayList<Comarca> getListado(Filtro f, Comparator<Comarca> c){
        ArrayList<Comarca> lista = new ArrayList<>();
        for(int i=0; i<this.elementos.size(); i++){
            lista.addAll(this.elementos.get(i).getListado(f,c));
        }
        Collections.sort(lista, c);
        return lista;
    }
}
