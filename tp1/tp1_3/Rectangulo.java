package tp1.tp1_3;

public class Rectangulo {
    PuntoGeometrico p1;
    PuntoGeometrico p2;
    PuntoGeometrico p3;
    public Rectangulo(PuntoGeometrico p1,PuntoGeometrico p2,PuntoGeometrico p3){
        this.p1 = p1;
        this.setP2(p2);
        this.setP3(p3);
    }
    public Rectangulo(PuntoGeometrico p1){
        this(p1,new PuntoGeometrico(p1.getX(),1),new PuntoGeometrico(1,p1.getY()));
    }
    public Rectangulo(PuntoGeometrico p1,PuntoGeometrico p2){
        this(p1,p2,new PuntoGeometrico(1,p1.getY()));
    }

    public void setP2(PuntoGeometrico p2) {
        if(p1.getX()==p2.getX()){
            this.p2 = p2;
        }else{
            System.out.println("X de p1 y p2 no son iguales");
        }
    }
    public void setP3(PuntoGeometrico p3) {
        if(p1.getY()==p3.getY()){
            this.p3 = p3;
        }else{
            System.out.println("Y de p1 y p2 no son iguales");
        }
    }

    public void Desplaza(int x, int y){
        this.p1.x+=x;
        this.p1.y+=y;
        this.p2.x+=x;
        this.p2.y+=y;
        this.p3.x+=x;
        this.p3.y+=y;
    }
    public double getAltura(){
        Distancia altura=new Distancia(p1, p2);
        return altura.getDistancia();
    }
    public double getAncho(){
        Distancia ancho=new Distancia(p1, p3);
        return ancho.getDistancia();
    }
    public double getArea(){
        return getAltura()*getAncho();
    }

    public void getComparacion(Rectangulo r){
        if(this.getArea()>r.getArea()){
            System.out.println(1+" (ES MAYOR)");
        }else if(this.getArea()==r.getArea()){
            System.out.println(0+" (SON IGUALES)");
        }else{
            System.out.println(-1+" (ES MENOR)");
        }
    }
    
    public void getCuadrado(){
        if(getAltura()==getAncho()){
            System.out.println("Es un CUADRADO");
        }
    }
    
    public void getPosicion(){
        if((getAltura()>getAncho())){
            System.out.println("PARADO");
        }
        if((getAltura()<getAncho())){
            System.out.println("ACOSTADO");
        }
    }
}
