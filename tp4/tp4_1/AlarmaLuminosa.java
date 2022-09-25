package tp4.tp4_1;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;
    public AlarmaLuminosa(boolean vidrioRoto, boolean aperturaExterior, boolean movimiento, Timbre timbre, Luz luz) {
        super(vidrioRoto, aperturaExterior, movimiento, timbre);
        this.setLuz(luz);
    }
    public Luz getLuz() {
        return luz;
    }
    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public void comprobar(){
        if(isAperturaExterior()||isMovimiento()||isVidrioRoto()){
            System.out.println(this.luz.encender()+" "+super.getTimbre().hacerSonar());
        }
    }

    
}
