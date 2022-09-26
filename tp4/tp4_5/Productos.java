package tp4.tp4_5;

public abstract class Productos {
    protected int fechaVencimiento;
    protected int numLote;

    public Productos(int fechaVencimiento, int numLote){
        this.fechaVencimiento = fechaVencimiento;
        this.numLote = numLote;
    }

    public abstract void getInformacion();

    public String toString(){
        return "fecha de vencimiento: "+fechaVencimiento+"\n num lote: "+numLote;
    }
}
