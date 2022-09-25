package tp3.tp3_1;

import java.util.ArrayList;

public class Encuesta {
    private String titulo;
    private ArrayList<String> preguntas;
    private Persona persona;
    private PersonaEmpleada empleado;
    private Compania compania;
    
    public Encuesta(String titulo, ArrayList<String> preguntas, Persona persona, PersonaEmpleada empleado, Compania compania) {
        this.titulo = titulo;
        this.preguntas = preguntas;
        this.persona = persona;
        this.empleado = empleado;
        this.compania = compania;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public ArrayList<String> getPreguntas() {
        return preguntas;
    }
    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public PersonaEmpleada getEmpleado() {
        return empleado;
    }
    public void setEmpleado(PersonaEmpleada empleado) {
        this.empleado = empleado;
    }
    
    private boolean Respondio(){
        if(compania.getEncuestas()!=null){
            for (Encuesta encuesta : compania.getEncuestas()) {
                if((encuesta.getTitulo().equals(this.titulo))&&(encuesta.getPersona().equals(this.persona))){
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }

    public void Realizado(){
        if (!Respondio()){
            this.compania.sumaEncuesta(this.titulo,this.preguntas,this.persona,this.empleado, this.compania);
            empleado.sumaEncuesta();  
        }else{
            System.out.println("ya respondio xd");
        }
    }
}
