package tp9.tp9_6;

import tp9.tp9_6.Comparadores.ComparadorAlfabetico;
import tp9.tp9_6.Filtros.Filtro;
import tp9.tp9_6.Filtros.FiltroCantHabitantes;

public class prueba {
    public static void main(String[] args) {
        Terreno t1 = new Terreno("t1");
        Comarca c1 = new Comarca("c1", 100, 50, 200);
        Comarca c2 = new Comarca("c2", 150, 30, 500);
        Comarca c3 = new Comarca("c3", 250, 10, 50);

        Terreno t2 = new Terreno("t2");
        Comarca c4 = new Comarca("c4", 150, 30, 500);
        Comarca c5 = new Comarca("c5", 250, 10, 50);

        Terreno t3 = new Terreno("t3");
        Comarca c6 = new Comarca("c6", 150, 30, 500);
        Comarca c7 = new Comarca("c7", 250, 10, 50);

        t1.addElemento(c1);
        t1.addElemento(c2);
        t1.addElemento(c3);
        t1.addElemento(t2);

        t2.addElemento(c4);
        t2.addElemento(c5);
        t2.addElemento(t3);

        t3.addElemento(c6);
        t3.addElemento(c7);

        Filtro f = new FiltroCantHabitantes(20);
        ComparadorAlfabetico c = new ComparadorAlfabetico();

        System.out.println(t1.getCantHabitantes()+"  "+t2.getCantHabitantes()+"  "+t3.getCantHabitantes());
        System.out.println(t1.getListado(f, c));



    }
}
