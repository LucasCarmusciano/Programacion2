package ListaVinculada.Comparadores;

import java.util.Comparator;

public class ComparadorIntegerDesc implements Comparator<Object>{
    private Integer o1;
    private Integer o2;

    @Override
    public int compare(Object o1, Object o2) {
        o1 = (Integer) o1;
        o2 = (Integer) o2;
        return this.o2-this.o1;
    }
    
}
