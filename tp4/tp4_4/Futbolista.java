package tp4.tp4_4;

public class Futbolista extends Integrante {
    private String posicion;
    private boolean zurdo;
    private int cantGoles;

    public Futbolista(String nombre, int numPasaporte, String fechaNacimiento, Estado estado, String posicion
    ,boolean zurdo, int cantGoles){
        super(nombre, numPasaporte, fechaNacimiento, estado);
        this.posicion = posicion;
        this.zurdo = zurdo;
        this.cantGoles = cantGoles;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean isZurdo() {
        return zurdo;
    }

    public int getCantGoles() {
        return cantGoles;
    }
    
}
