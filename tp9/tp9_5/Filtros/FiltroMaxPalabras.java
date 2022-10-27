package tp9.tp9_5.Filtros;

import tp9.tp9_5.Notificacion;

public class FiltroMaxPalabras extends Filtro{
    private int max;

    public FiltroMaxPalabras(int max){
        this.max = max;
    }
    @Override
    public boolean cumple(Notificacion n) {
        if(n.getMensaje().length()<=max){
            return true;
        }
        return false;
    }
    
}
