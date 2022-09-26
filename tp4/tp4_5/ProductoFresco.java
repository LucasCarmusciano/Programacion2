package tp4.tp4_5;

public class ProductoFresco extends Productos {
    private int fechaEnvasado;
    private String granjaOrigen;
    
    public ProductoFresco(int fechaVencimiento, int numLote, int fechaEnvasado, String granjaOrigen){
        super(fechaVencimiento, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }
    
    public String toString(){
        return super.toString()+"\n fecha de envasado: "+this.fechaEnvasado+"\n granja de origen: "+this.granjaOrigen;
    }
    
    public int getFechaEnvasado() {
        return fechaEnvasado;
    }
    public String getGranjaOrigen() {
        return granjaOrigen;
    }
}
