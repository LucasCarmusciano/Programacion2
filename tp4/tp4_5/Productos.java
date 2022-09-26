package tp4.tp4_5;

public abstract class Productos {
    protected int fechaVencimiento;
    protected int numLote;

    public Productos(int fechaVencimiento, int numLote){
        this.fechaVencimiento = fechaVencimiento;
        this.numLote = numLote;
    }

    public void getInformacion(){
        System.out.println(this);
    }

    public String toString(){
        return "fecha de vencimiento: "+this.fechaVencimiento+"\n num lote: "+this.numLote;
    }
}
