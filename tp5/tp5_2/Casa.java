package tp5.tp5_2;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int cantMaxAlumnos;
    private ArrayList<String> cualidadesNecesarias;
    protected ArrayList<Alumno> listaAlumnos;
    private ArrayList<Casa> casasEnemigas;

    
    
    public Casa(String nombre, int cantMaxAlumnos){
        this.nombre = nombre;
        this.cantMaxAlumnos = cantMaxAlumnos;
        this.listaAlumnos = new ArrayList<>();
        this.cualidadesNecesarias = new ArrayList<>();
        this.casasEnemigas = new ArrayList<>();
    }
    
    public void addCualidad(String c){
        this.cualidadesNecesarias.add(c);
    }
    public void addEnemigo(Casa casa){
        this.casasEnemigas.add(casa);
    }
    public void addAlumno(Alumno a){
        if(a.permitido(this) && (this.listaAlumnos.size()<this.cantMaxAlumnos)){
            this.listaAlumnos.add(a);
        }
    }

    public ArrayList<String> getCualidadesNecesarias(){
        ArrayList<String> cualidades = new ArrayList<>(this.cualidadesNecesarias);
        return cualidades;
    }
    public ArrayList<Casa> getCasasEnemigas(){
        ArrayList<Casa> enemigos = new ArrayList<>(this.casasEnemigas);
        return enemigos;
    }
    public ArrayList<Alumno> getListaAlumnos(){
        ArrayList<Alumno> a = new ArrayList<>(this.listaAlumnos);
        return a;
    }
    
    public String toString(){
        return "alumnos: "+this.listaAlumnos;
    }
    public String getNombre() {
        return this.nombre;
    }
}
