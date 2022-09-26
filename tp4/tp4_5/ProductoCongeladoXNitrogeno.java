package tp4.tp4_5;

public class ProductoCongeladoXNitrogeno extends ProductoRefrigerado {
    private String metodoCongelacion;
    public ProductoCongeladoXNitrogeno(int fechaVencimiento, int numLote, int fechaEnvasado, String granjaOrigen,
     int codigoOrganismo, int tempMantenimiento, String metodoCongelacion){
        super(fechaVencimiento, numLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
     }
    
    public String toString(){
        return super.toString()+"\n composicion del aire: "+this.metodoCongelacion;
    }
}
