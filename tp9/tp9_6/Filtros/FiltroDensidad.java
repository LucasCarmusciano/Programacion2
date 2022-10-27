package tp9.tp9_6.Filtros;

import tp9.tp9_6.Comarca;

public class FiltroDensidad extends Filtro{
    private double densidadMax;
    public FiltroDensidad(double densidadMax){
        this.densidadMax = densidadMax;
    }

    public boolean cumple(Comarca c){
        return c.getDensidadPoblacion()<=this.densidadMax;
    }
}
