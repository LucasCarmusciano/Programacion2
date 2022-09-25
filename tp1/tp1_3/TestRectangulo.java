package tp1.tp1_3;

public class TestRectangulo {
    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico(0,0);
        PuntoGeometrico p2 = new PuntoGeometrico(0,4);
        PuntoGeometrico p3 = new PuntoGeometrico(4,0);
        Rectangulo r1 = new Rectangulo(p1, p2, p3);
        Rectangulo r2 = new Rectangulo(p1);
        System.out.println("SU ALTURA ES: "+r1.getAltura());
        System.out.println("SU ANCHO ES: "+r1.getAncho());
        r1.getComparacion(r2);
        r1.getCuadrado();
        System.out.println("EL AREA 1 ES: "+r1.getArea());
        System.out.println("EL AREA 2 ES: "+r2.getArea());
        System.out.println("("+p1.x+","+p1.y+")/("+p2.x+","+p2.y+")/("+p3.x+","+p3.y+")/");
        r1.Desplaza(2,3);
        System.out.println("("+p1.x+","+p1.y+")/("+p2.x+","+p2.y+")/("+p3.x+","+p3.y+")/");

    }
}
