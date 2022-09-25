package tp4.tp4_1;

public class Alarma {
    private boolean vidrioRoto;
    private boolean aperturaExterior;
    private boolean movimiento;
    private Timbre timbre;
    public Alarma(boolean vidrioRoto, boolean aperturaExterior, boolean movimiento, Timbre timbre) {
        this.vidrioRoto = vidrioRoto;
        this.aperturaExterior = aperturaExterior;
        this.movimiento = movimiento;
        this.setTimbre(timbre);
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
            System.out.println(this.timbre.hacerSonar());
        }
    }
    
}
