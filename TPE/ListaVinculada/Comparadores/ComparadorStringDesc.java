package ListaVinculada.Comparadores;

import java.util.Comparator;

public class ComparadorStringDesc implements Comparator<Object>{
    private String o1;
    private String o2;

    @Override
    public int compare(Object o1, Object o2) {
        o1 = (String) o1;
        o2 = (String) o2;
        return this.o2.compareTo(this.o1);
    }
    
}
