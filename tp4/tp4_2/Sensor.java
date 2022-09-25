package tp4.tp4_2;

public class Sensor {
    private String zonaNombre;
    private boolean vidrioRoto;
    private boolean aperturaExterior;
    private boolean movimiento;
    private Timbre timbre;
    public Sensor(String zonaNombre, boolean vidrioRoto, boolean aperturaExterior, boolean movimiento, Timbre timbre) {
        this.setZonaNombre(zonaNombre);
        this.vidrioRoto = vidrioRoto;
        this.aperturaExterior = aperturaExterior;
        this.movimiento = movimiento;
        this.setTimbre(timbre);
    }
    public String getZonaNombre() {
        return zonaNombre;
    }
    public void setZonaNombre(String zonaNombre) {
        this.zonaNombre = zonaNombre;
    }
    public Timbre getTimbre() {
        return timbre;
    }
    public void setTimbre(Timbre timbre) {
        this.timbre = timbre;
    }
    public boolean isVidrioRoto() {
        return vidrioRoto;
    }
    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }
    public boolean isAperturaExterior() {
        return aperturaExterior;
    }
    public void setAperturaExterior(boolean aperturaExterior) {
        this.aperturaExterior = aperturaExterior;
    }
    public boolean isMovimiento() {
        return movimiento;
    }
    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    public void comprobar(){
        if(isAperturaExterior()||isMovimiento()||isVidrioRoto()){
            System.out.println(this.timbre.hacerSonar()+"\n zona: "+this.zonaNombre);
        }
    }
    
}
