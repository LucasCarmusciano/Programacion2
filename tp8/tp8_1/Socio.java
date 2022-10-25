package tp8.tp8_1;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private int edad;
    private ArrayList<Alquiler> alquileres;
    private boolean cuotaPaga;

    public Socio(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.cuotaPaga = false;
        this.alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public ArrayList<Alquiler> getAlquileres() {
        ArrayList<Alquiler> copiaAlquileres = new ArrayList<>(alquileres);
        return copiaAlquileres;
    }
    public boolean isCuotaPaga() {
        return cuotaPaga;
    }
    
    public void paga(){
        this.cuotaPaga = true;
    }
    
    public void addAlquiler(Alquiler a){
        this.alquileres.add(a);
    }
}
