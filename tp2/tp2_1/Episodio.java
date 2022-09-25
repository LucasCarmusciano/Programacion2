package tp2.tp2_1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private int calificacion;
    
    public Episodio(String titulo, String descripcion, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }
    public Episodio(String titulo, String descripcion){
        this(titulo, descripcion, -1);
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        if(calificacion<1 || calificacion>5){
            System.out.println("CALIFICACION ERRONEA");
        }else{
            this.calificacion = calificacion;
        }
    }

    public boolean getVisto(){
        return (calificacion>0);
    }
    
    @Override
    public String toString() {
        return "Episodio [calificacion=" + calificacion + ", descripcion=" + descripcion + ", titulo=" + titulo + "]";
    }

    

    
}
