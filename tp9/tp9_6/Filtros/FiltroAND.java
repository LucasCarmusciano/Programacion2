package tp9.tp9_6.Filtros;

import tp9.tp9_6.Comarca;

public class FiltroAND extends Filtro{
    private Filtro f1;
    private Filtro f2;
    public FiltroAND(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(Comarca c){
        if(f1.cumple(c)&&f2.cumple(c)){
            return true;
        }
        return false;
    }
}
