package tp9.tp9_5.Filtros;

import tp9.tp9_5.Notificacion;

public class FiltroPalabra extends Filtro {
    private String palabra;

    public FiltroPalabra(String palabra){
        this.palabra = palabra;
    }
    @Override
    public boolean cumple(Notificacion notificacion) {
        if(notificacion.getMensaje().contains(this.palabra)){
            return true;
        }
        return false;
    }
    
}
