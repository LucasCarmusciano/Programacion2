package tp4.tp4_5;

public class ProductoCongeladoXAire extends ProductoRefrigerado {
    private String composicionAire;
    public ProductoCongeladoXAire(int fechaVencimiento, int numLote, int fechaEnvasado, String granjaOrigen,
     int codigoOrganismo, int tempMantenimiento, String composicionAire){
        super(fechaVencimiento, numLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
        this.composicionAire = composicionAire;
     }
    
    public String toString(){
        return super.toString()+"\n salidad: "+this.composicionAire;
    }
}
