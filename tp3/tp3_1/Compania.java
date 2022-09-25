package tp3.tp3_1;

import java.util.ArrayList;

public class Compania {
    private ArrayList<Encuesta> encuestas = new ArrayList<>();
    private String nombre;

    public Compania(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }
    public void sumaEncuesta(String titulo, ArrayList<String> preguntas, Persona persona, PersonaEmpleada empleado, Compania compania){
        this.encuestas.add(new Encuesta(titulo, preguntas, persona, empleado, compania));
    }
}
