package tp4.tp4_5;

public class ProductoCongeladoXAgua extends ProductoRefrigerado{
    private int salidad;
    public ProductoCongeladoXAgua(int fechaVencimiento, int numLote, int fechaEnvasado, String granjaOrigen,
     int codigoOrganismo, int tempMantenimiento, int salidad){
        super(fechaVencimiento, numLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
        this.salidad = salidad;
     }
    
    public String toString(){
        return super.toString()+"\n composicion del aire: "+this.salidad;
    }
}
