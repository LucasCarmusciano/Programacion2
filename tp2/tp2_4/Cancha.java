package tp2.tp2_4;

public class Cancha {
    String deporte;
    int numero;
    int precio;

    public Cancha(String deporte, int numero, int precio) {
        this.deporte = deporte;
        this.numero = numero;
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
}
