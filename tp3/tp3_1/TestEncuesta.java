package tp3.tp3_1;

import java.util.ArrayList;

public class TestEncuesta {
    public static void main(String[] args) {
        String pr1 = "Pregunta 1";
        String pr2 = "Pregunta 2";
        String pr3 = "Pregunta 3";
        String pr4 = "Pregunta 4";
        ArrayList<String> preguntas1= new ArrayList<>();
        preguntas1.add(pr1);
        preguntas1.add(pr2);
        preguntas1.add(pr3);
        preguntas1.add(pr4);

        ArrayList<String> preguntas2= new ArrayList<>();
        preguntas2.add(pr2);

        Persona pepe = new Persona(11111111);
        Persona mili = new Persona(43824773);
        PersonaEmpleada lucas = new PersonaEmpleada(43864499);
        Compania compania = new Compania("Compania");

        Encuesta encuesta1 = new Encuesta("primer encuesta", preguntas1, mili, lucas, compania);
        Encuesta encuesta2 = new Encuesta("segunda encuesta", preguntas2, pepe, lucas, compania);
        Encuesta encuesta3 = new Encuesta("tercera encuesta", preguntas1, pepe, lucas, compania);
        Encuesta encuesta4 = new Encuesta("primer encuesta", preguntas1, mili, lucas, compania);
        ArrayList<Encuesta> encuestas = new ArrayList<>();
        encuestas.add(encuesta1);
        encuestas.add(encuesta2);
        encuestas.add(encuesta3);
        encuestas.add(encuesta4);
        
        System.out.println("cant encuestas hechas: "+lucas.getCantEncuestasHechas());
        encuesta1.Realizado();
        
        System.out.println("nombre: "+encuesta1.getTitulo()+"\n preguntas: "+encuesta1.getPreguntas()+"\n persona: "+encuesta1.getEmpleado().getDni()+"\n empleado: "+encuesta1.getEmpleado().getDni());
        encuesta2.Realizado();
        System.out.println("cant encuestas hechas: "+lucas.getCantEncuestasHechas());
        
        encuesta3.Realizado();
        
        System.out.println("nombre: "+encuesta2.getTitulo()+"\n preguntas: "+encuesta2.getPreguntas()+"\n persona: "+encuesta2.getEmpleado().getDni()+"\n empleado: "+encuesta2.getEmpleado().getDni());
        System.out.println("cant encuestas hechas: "+lucas.getCantEncuestasHechas());
        
        encuesta4.Realizado();
        
        System.out.println("cant encuestas hechas: "+lucas.getCantEncuestasHechas());




    }
}
