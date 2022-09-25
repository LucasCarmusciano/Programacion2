package tp4.tp4_3;

public abstract class Empleado {
    protected float salarioFijo;
    protected String nombre;
    public Empleado(float salarioFijo, String nombre){
        this.salarioFijo = salarioFijo;
        this.nombre = nombre;
    }
    public abstract float getSalario();

    public String toString(){
        return "El salario de "+this.nombre+" es: "+this.getSalario();
    }
}
