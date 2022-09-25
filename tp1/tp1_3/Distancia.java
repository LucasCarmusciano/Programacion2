package tp1.tp1_3;

public class Distancia {
    PuntoGeometrico p1;
    PuntoGeometrico p2;

    public Distancia(PuntoGeometrico p1, PuntoGeometrico p2){
        this.p1 = p1;
        this.p2 = p2;

    }
    public double getDistancia(){
        return Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2)+(Math.pow((p1.getY()-p2.getY()), 2)));
    }
}
