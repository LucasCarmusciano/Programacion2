package tp4.tp4_4;

public class Masajista extends Integrante {
    private String titulo;
    private int cantAnios;
    public Masajista(String nombre, int numPasaporte, String fechaNacimiento, Estado estado
    , String titulo, int cantAnios){
        super(nombre, numPasaporte, fechaNacimiento, estado);
        this.titulo = titulo;
        this.cantAnios = cantAnios;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getCantAnios() {
        return cantAnios;
    }
}
