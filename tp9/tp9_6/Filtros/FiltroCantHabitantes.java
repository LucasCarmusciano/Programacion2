package tp9.tp9_6.Filtros;
import tp9.tp9_6.Comarca;

public class FiltroCantHabitantes extends Filtro{
    private int cantMax;
    public FiltroCantHabitantes(int cantMax){
        this.cantMax = cantMax;
    }

    public boolean cumple(Comarca c){
        if(c.getCantHabitantes()<=this.cantMax){
            return true;
        }
        return false;
    }
}
