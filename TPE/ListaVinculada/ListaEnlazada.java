package ListaVinculada;

import java.util.Iterator;

public class ListaEnlazada implements Iterable<Object>{
    private Nodo cabeza;
    private int size;

    public ListaEnlazada(Nodo cabeza) {
        this.cabeza = cabeza;
        this.size = 1;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
    
    public void addNodo(Object o){ //para prboar
        Nodo nuevoNodo = new Nodo(o);
        nuevoNodo.setSiguiente(this.cabeza);
        this.cabeza = nuevoNodo;
        this.size++;
    }

    

    // private void ordenar(){
    //     Nodo aux = this.cabeza;
    //     Nodo actual;
    //     Object temp;
    //     while(aux.getSiguiente()!=null){
    //         actual = aux.getSiguiente();
    //         while(actual!=null){
    //             if((aux.getElemento())>(actual.getElemento())){
    //                 temp = aux.getElemento();
    //                 aux.getElemento() = actual.getElemento();
    //                 actual.getElemento() = temp;
    //             }
    //             actual = actual.getSiguiente();
    //         }
    //         aux.getSiguiente();
    //     }
    // }

    
    public int size(){
        return this.size;
    }
    
    public void eliminar(int pos){
        Nodo aux = cabeza;
        if(pos == 0){
            this.cabeza = this.cabeza.getSiguiente();
        }else if(pos == size-1){
            while(aux.getSiguiente().getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }else{
            for(int i=0; i<pos-1; i++){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        this.size--;
    }
    
    public void eliminarOcurrencias(Object obj){
        Nodo aux = cabeza;
        int i = 0;
        while(aux!=null){
            if(aux.getElemento().equals(obj)){
                System.out.println("pos "+i);
                aux = aux.getSiguiente();
                this.eliminar(i);
            }else{
                aux = aux.getSiguiente();
                i++;
            }
        }      
    }
    
    public int getPosicion(Object obj){
        Nodo aux = cabeza;
        int i = 0;
        while (!aux.getElemento().equals(obj)) {
            aux = aux.getSiguiente();
            i++;
        }
        return i;
    }
    
    public void imprimir(){
        Nodo aux = this.cabeza;
        System.out.println(aux.getElemento());
        while (aux.getSiguiente()!=null){
            aux = aux.getSiguiente();
            System.out.println(aux.getElemento());
        }
    }

    
    @Override
    public Iterator<Object> iterator() {
        return new Iterador();
    }

    private class Iterador implements Iterator<Object>{
        private Nodo pos;
        public Iterador(){
            this.pos = cabeza;
        }

        @Override
        public boolean hasNext() {
            return (pos.getSiguiente()!=null);
        }

        @Override
        public Object next() {
            pos = pos.getSiguiente();
            return pos;
        }
    }
}
