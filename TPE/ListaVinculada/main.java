package ListaVinculada;

public class main {
    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("e");
        String c = new String("c");
        String d = new String("e");
        String e = new String("e");
        String f = new String("f");

        Nodo n1 = new Nodo(a);

        ListaEnlazada lista = new ListaEnlazada(n1);
        lista.addNodo(b);
        lista.addNodo(c);
        lista.addNodo(d);
        lista.addNodo(e);
        lista.addNodo(f);

        lista.imprimir();
        lista.eliminarOcurrencias("e");
        System.out.println("---------------------");

        lista.imprimir();
    }
}
