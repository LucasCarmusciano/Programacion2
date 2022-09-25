package tp1.tp1_3;

public class TestDistancia {
    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico();
        PuntoGeometrico p2 = new PuntoGeometrico(5,5);
        Distancia d = new Distancia(p1, p2);
        System.out.println("La distancia es: "+ d.getDistancia());
    }
}
