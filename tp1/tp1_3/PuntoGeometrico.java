package tp1.tp1_3;

public class PuntoGeometrico {
    int x;
    int y;

    public PuntoGeometrico(int x,int y){
        this.x=x;
        this.y=y;
    }
    public PuntoGeometrico(){
        this(0,0);
    }
    public PuntoGeometrico(int x){
        this(x,0);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
