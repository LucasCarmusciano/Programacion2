package tp8.tp8_1;

import java.util.ArrayList;

public class Club implements Comparable<Socio>{
    private ArrayList<Socio> socios;
    
    public Club(){
        this.socios = new ArrayList<>();
    }

    public void addSocio(Socio socio){
        this.socios.add(socio);
    }

    @Override
    public int compareTo(Socio o) {
        return 0;
    }
}
