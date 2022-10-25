package tp8.tp8_1;

public class Alquiler {
    private int fecha;
    private int idCancha;
    private int precio;

    public Alquiler(int fecha, int idCancha, int precio){
        this.fecha = fecha;
        this.idCancha = idCancha;
        this.precio = precio;
    }

    public int getFecha() {
        return fecha;
    }
    public int getIdCancha() {
        return idCancha;
    }
    public int getPrecio() {
        return precio;
    }

}
