package tp5.tp5_2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;
    
    public Alumno(String nombre){
        this.nombre = nombre;
        cualidades = new ArrayList<>();
        familiares = new ArrayList<>();
    }

    public ArrayList<String> getCualidades(){
        ArrayList<String> c = new ArrayList<>(this.cualidades);
        return c;
    }
    public ArrayList<Alumno> getFamiliares(){
        ArrayList<Alumno> f = new ArrayList<>(this.familiares);
        return f;
    }

    public void addFamiliar(Alumno f){
        familiares.add(f);
    }

    public void addCualidad(String c){
        cualidades.add(c);
    }

    public String toString(){
        return this.nombre;
    }

    public boolean permitido(Casa casa){
        for(int i=0; i<casa.getCualidadesNecesarias().size(); i++){
            if(this.cualidades.contains(casa.getCualidadesNecesarias().get(i))){
                return false;
            }
        }
        return true;
    }
}
