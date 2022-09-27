package tp5.tp5_2;

public class PruebaSombrero {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Lucas");
        a1.addCualidad("Sabiduria");
        a1.addCualidad("Fuerza");
        Casa c1 = new Casa("Slytherin", 5);
        c1.addCualidad("Sabiduria");
        c1.addCualidad("Fuerza");
        c1.addAlumno(a1);
        
        Alumno a2 = new Alumno("Claudio");
        a2.addCualidad("Fuerza");
        a2.addCualidad("Sabiduria");
        Alumno a3 = new Alumno("Milagros");
        a3.addCualidad("Fuerza");
        a3.addCualidad("Sabiduria");
        Alumno a4 = new Alumno("Leonel");
        a4.addCualidad("Fuerza");
        a4.addCualidad("Sabiduria");
        Alumno a5 = new Alumno("Alejandra");
        a5.addCualidad("Fuerza");
        a5.addCualidad("Sabiduria");
        c1.addAlumno(a2);
        c1.addAlumno(a3);
        c1.addAlumno(a4);
        c1.addAlumno(a5);
        System.out.println(c1);
    }
}
