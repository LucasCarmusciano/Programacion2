package tp4.tp4_5;

public class ProductoRefrigerado extends ProductoFresco {
    private int codigoOrganismo;
    private int tempMantenimiento;

    public ProductoRefrigerado(int fechaVencimiento, int numLote, int fechaEnvasado, String granjaOrigen, int codigoOrganismo, int tempMantenimiento){
        super(fechaVencimiento, numLote, fechaEnvasado, granjaOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.tempMantenimiento = tempMantenimiento;
    }
    public String toString(){
        return super.toString()+"\n codigo del organismo de supervisión alimentaria: "+this.codigoOrganismo+"\n temperatura de mantenimiento: "+this.tempMantenimiento;
    }
}
