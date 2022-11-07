package ListaVinculada;

public class Nodo {
    private Comparable elemento;
    private Nodo siguiente;

    public Nodo(Comparable elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo n){
        this.siguiente = n;
    }
    public void setElemento(Comparable e){
        this.elemento = e;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }

    public Comparable getElemento(){
        return this.elemento;
    }
}
