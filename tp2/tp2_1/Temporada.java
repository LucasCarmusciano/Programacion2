package tp2.tp2_1;

import java.util.ArrayList;

public class Temporada {
    private ArrayList<Episodio> episodios;

    public Temporada(ArrayList<Episodio> episodios) {
        this.episodios = new ArrayList<>(episodios);
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }
    
    public int getEpisodiosVistos() {
        int vistos = 0;
        for (Episodio epi : episodios) {
            if (epi.getVisto()) {
                vistos++;
            }
        }
        return vistos;
    }

    public float getPromedio() {
        float calificaciones = 0;
        for (Episodio epi : episodios) {
            if (epi.getVisto()) {
                calificaciones += epi.getCalificacion();        
            }
        }
        return calificaciones/getEpisodiosVistos();
    } 

    public int getCantEpisodios() {
        return episodios.size();
    }

    @Override
    public String toString() {
        return "Temporada [episodios=" + episodios + "]";
    }

    
    

}
