package tp5.tp5_2;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int cantMaxAlumnos;
    protected ArrayList<String> cualidadesNecesarias;
    protected ArrayList<Alumno> listaAlumnos;
    
    
    public Casa(String nombre, int cantMaxAlumnos){
        this.nombre = nombre;
        this.cantMaxAlumnos = cantMaxAlumnos;
        listaAlumnos = new ArrayList<>();
        cualidadesNecesarias = new ArrayList<>();
    }
    
    public void addCualidad(String c){
        cualidadesNecesarias.add(c);
    }
    
    public void addAlumno(Alumno a){
        if(a.permitido(this) && (this.listaAlumnos.size()<this.cantMaxAlumnos)){
            listaAlumnos.add(a);
        }
    }

    public ArrayList<String> getCualidadesNecesarias(){
        ArrayList<String> cualidades = new ArrayList<>(this.cualidadesNecesarias);
        return cualidades;
    }
    
    public ArrayList<Alumno> getListaAlumnos(){
        ArrayList<Alumno> a = new ArrayList<>(this.listaAlumnos);
        return a;
    }
    
    public String toString(){
        return "alumnos: "+listaAlumnos;
    }
    public String getNombre() {
        return nombre;
    }
}
