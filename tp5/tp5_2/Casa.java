package tp5.tp5_2;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int cantMaxAlumnos;
    private ArrayList<String> cualidadesNecesarias;
    private ArrayList<Alumno> listaAlumnos;


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
        boolean permitido=true;
        for(int i=0; i<cualidadesNecesarias.size(); i++){
            if(!a.getCualidades().contains(this.cualidadesNecesarias.get(i))){
                permitido=false;
            }
        }
        if(permitido && (listaAlumnos.size()<cantMaxAlumnos)){
            listaAlumnos.add(a);
        }
    }

    public ArrayList<Alumno> getListaAlumnos(){
        ArrayList<Alumno> a = new ArrayList<>(this.listaAlumnos);
        return a;
    }

    public String toString(){
        return "alumnos: "+listaAlumnos;
    }
}
