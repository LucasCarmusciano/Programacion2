package tp2.tp2_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Episodio ep1 = new Episodio("Epi1", "episodio 1");
        Episodio ep2 = new Episodio("Epi2", "episodio 2");
        Episodio ep3 = new Episodio("Epi3", "episodio 3");
        Episodio ep4 = new Episodio("Epi4", "episodio 4");

        ArrayList<Episodio> episodios = new ArrayList<>();
        episodios.add(ep1);
        episodios.add(ep2);
        episodios.add(ep3);
        episodios.add(ep4);

        ep1.setCalificacion(3);
        ep2.setCalificacion(3);
        ep3.setCalificacion(4);
        ep4.setCalificacion(4);


        Temporada te1 = new Temporada(episodios);
        ArrayList<Temporada> temporadas = new ArrayList<>();

        temporadas.add(te1);

        Serie s1 = new Serie(temporadas, "Serie 1", "Descripcion serie 1", "Creador serie 1", "genero serie 1");

        // System.out.println(s1);
        System.out.println(s1.getCantEpisodios());
        System.out.println(s1.getEpisodiosVistos());
        System.out.println(te1.getCantEpisodios());
        System.out.println("serie completa?: "+s1.getSerieCompleta());
    }   
}
