package tp2.tp2_4;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private String nombre;
    private ArrayList <Turno> turnos;
    private static final long minMesesSocio = 5259600000L;
    private static final int minTurnosSocio=4;
    public Usuario(String nombre, ArrayList<Turno> turno) {
        this.nombre = nombre;
        this.turnos = new ArrayList<>(turno);
    }
    public boolean socio(){
        int i=0;
        Date fechaHoy = new Date();
        for (Turno turno : turnos) {
                if(fechaHoy.getTime()-turno.getFecha().getTime()<minMesesSocio){
                    i++;
                }
        }
        return (i>=minTurnosSocio);
    }
    public String getNombre(){
        return nombre;
    }
}
