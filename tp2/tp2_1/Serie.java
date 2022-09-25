package tp2.tp2_1;

import java.util.ArrayList;

public class Serie {
    private ArrayList<Temporada> temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    public Serie(ArrayList<Temporada> temporadas, String titulo, String descripcion, String creador, String genero) {
        this.temporadas = temporadas;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodiosVistos() {
        int vistos = 0;
        for (Temporada tem : temporadas) {
            vistos += tem.getEpisodiosVistos();
        }
        return vistos;
    }

    public float getPromedio() {
        float calificaciones = 0;
        int temporadasVistas = 0;
        for (Temporada tem : temporadas) {
            if (tem.getPromedio()>0) {
                temporadasVistas ++;
                calificaciones += tem.getPromedio();        
            }
        }
        return calificaciones/temporadasVistas;
    } 

    public int getCantEpisodios() {
        int cantEpisodios = 0;
        for (Temporada tem : temporadas) {
            cantEpisodios += tem.getCantEpisodios();
        }
        return cantEpisodios;
    }

    public boolean getSerieCompleta() {
        return (this.getEpisodiosVistos() == this.getCantEpisodios());
    }

    @Override
    public String toString() {
        return "Serie [creador=" + creador + ", descripcion=" + descripcion + ", genero=" + genero + ", temporadas="
                + temporadas + ", titulo=" + titulo + "]";
    }

    
    
}
