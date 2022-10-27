package tp9.tp9_6.Comparadores;
import java.util.Comparator;

import tp9.tp9_6.Comarca;

public class ComparadorAlfabetico implements Comparator<Comarca>{
    @Override
    public int compare(Comarca c1, Comarca c2){
        return c1.getNombre().compareTo(c2.getNombre());
    }
}
