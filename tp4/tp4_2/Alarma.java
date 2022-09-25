package tp4.tp4_2;

import java.util.ArrayList;

public class Alarma {
    private ArrayList <Sensor> sensores = new ArrayList<>();

    public Alarma(ArrayList<Sensor> sensores) {
        this.setSensores(sensores);
    }

    public ArrayList <Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList <Sensor> sensores) {
        this.sensores = sensores;
    }
    public void comprobar(){
        for(Sensor s : sensores){
            if(s.isAperturaExterior()||s.isMovimiento()||s.isVidrioRoto()){
                System.out.println(s.getTimbre().hacerSonar()+"\n zona: "+s.getZonaNombre());
            }
        }
    }
}
