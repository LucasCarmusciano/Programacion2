package ListaVinculada;

public class ListaEnlazada {
    private Nodo cabeza;
    private int size;

    public ListaEnlazada(Nodo cabeza) {
        this.cabeza = cabeza;
        this.size = 1;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
    
    public void addNodo(Comparable o){ //para prboar
        Nodo nuevoNodo = new Nodo(o);
        nuevoNodo.setSiguiente(this.cabeza);
        this.cabeza = nuevoNodo;
        this.size++;
        
        if(o.compareTo(this.cabeza.getElemento())>=0){
            nuevoNodo.setSiguiente(this.cabeza);
            this.cabeza = nuevoNodo;
        }else {
            Nodo aux = this.cabeza;

            while(!(aux.getSiguiente()==null)){
                if (o.compareTo(aux.getSiguiente().getElemento())<0) {
                    aux = aux.getSiguiente();
                    break;
                } //SEGUIR VIENDO
            }
            nuevoNodo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevoNodo);

        }
    }

    public int size(){
        return this.size;
    }

    public void eliminar(int pos){
        if(pos == 0){
            this.cabeza = this.cabeza.getSiguiente();
        }else{
            Nodo aux = cabeza;
            for(int i=0; i<pos; i++){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        this.size--;
    }

    public void eliminarOcurrencias(Comparable obj){
        Nodo aux = cabeza;        
        for(int i=0; i<this.size; i++){
            System.out.println(i);
            if(aux.getElemento().equals(obj)){ //NO ENTRA PREGUNTAR AL PROFE
                System.out.println("ENTRO");
                this.eliminar(i);
                i++;
            }
            System.out.println(aux.hashCode());
            aux = aux.getSiguiente();
        }
    }

    public int getPosicion(Comparable obj){
        Nodo aux = cabeza;
        int i = 0;
        while (!aux.getElemento().equals(obj)) {
            aux = aux.getSiguiente();
            i++;
        }
        return i;
    }

    
    public void ordenar(){
        
    }
}
