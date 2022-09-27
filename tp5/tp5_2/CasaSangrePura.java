package tp5.tp5_2;

import java.util.ArrayList;

public class CasaSangrePura extends Casa {
    public CasaSangrePura(String nombre, int cantMaxAlumnos, Alumno fundador){  //necesario para poder agregar a gente que sea de su familia
        super(nombre, cantMaxAlumnos);
        this.listaAlumnos = new ArrayList<>();
        this.listaAlumnos.add(fundador);
    }

    public void addAlumno(Alumno a){
        for(int i=0; i<a.getFamiliares().size(); i++){
            if(this.listaAlumnos.contains(a.getFamiliares().get(i))){
                super.addAlumno(a);
                break;
            }
        }
    }
}
