package tp5.tp5_2;

public class PruebaSombrero {
    public static void main(String[] args) {
        Alumno fundador = new Alumno("Jesus");
        Casa c1 = new Casa("Slytherin", 5);
        CasaSangrePura c2 = new CasaSangrePura("Sanguinea", 6, fundador);
        
        c1.addCualidad("Sabiduria");
        c1.addCualidad("Fuerza");
        
        Alumno a1 = new Alumno("Lucas");
        a1.addCualidad("Sabiduria");
        a1.addCualidad("Fuerza");
        a1.addFamiliar(fundador);

        Alumno a2 = new Alumno("Claudio");
        a2.addCualidad("Fuerza");
        a2.addCualidad("Sabiduria");
        a2.addFamiliar(fundador);
        a2.addFamiliar(a1);

        Alumno a3 = new Alumno("Milagros");
        a3.addCualidad("Fuerza");
        a3.addCualidad("Sabiduria");

        Alumno a4 = new Alumno("Leonel");
        a4.addCualidad("Fuerza");
        a4.addCualidad("Sabiduria");

        Alumno a5 = new Alumno("Alejandra");
        a5.addCualidad("Fuerza");
        a5.addCualidad("Sabiduria");

        c1.addAlumno(a1);
        c1.addAlumno(a2);
        c1.addAlumno(a3);
        c1.addAlumno(a4);
        c1.addAlumno(a5);

        c2.addAlumno(a1);
        c2.addAlumno(a2);

        System.out.println(c2);


    }
}
