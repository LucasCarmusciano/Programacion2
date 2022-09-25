package tp1.tp1_2;

public class Electrodomestico {

    String nombre;
    double precioBase;
    String color;
    double consumoEnergetico;
    double peso;
    
    public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico, double peso){
        this.nombre= nombre;
        this.precioBase=precioBase;
        this.color=color;
        this.consumoEnergetico=consumoEnergetico;
        this.peso=peso;
    }
    public Electrodomestico(String nombre){
        this(nombre,100,"gris plata",10,2);
    }
    public Electrodomestico(String nombre, double precioBase){
        this(nombre,precioBase,"gris plata",10,2);
    }
    public Electrodomestico(String nombre, double precioBase, String color){
        this(nombre,precioBase,color,10,2);
    }
    public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico){
        this(nombre,precioBase,color,consumoEnergetico,2);
    }

    public String getNombre(){
        return this.nombre;
    }
    public double getPrecioBase(){
        return this.precioBase;
    }
    public String getColor(){
        return this.color;
    }
    public double getConsumoEnergetico(){
        return this.consumoEnergetico;
    }
    public double getPeso(){
        return this.peso;
    }

    public void getIndiceConsumo(){
        if(this.consumoEnergetico<45){
            System.out.println("bajo consumo");
        }else{
            System.out.println("NO es bajo consumo");
        }
    }
    public double getBalance(){
        return this.precioBase/this.peso;
    }
    public void getIndiceGama(){
        double b=this.getBalance();
        if(b>3){
            System.out.println("alta gama");
        }else{
            System.out.println("NO es alta gama");
        }
    }
}
