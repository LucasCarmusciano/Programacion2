package tp4.tp4_4;

public class Entrenador extends Integrante{
    private String federacion;
    public String getFederacion() {
        return federacion;
    }
    public Entrenador(String nombre, int numPasaporte, String fechaNacimiento, Estado estado, String federacion){
        super(nombre, numPasaporte, fechaNacimiento, estado);
        this.federacion = federacion;
    }
}
