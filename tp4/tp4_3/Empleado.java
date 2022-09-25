package Programacion2.tp4.tp4_3;

public class Empleado {
    private float salarioFijo;
    private String nombre;
    public Empleado(float salarioFijo, String nombre){
        this.salarioFijo = salarioFijo;
        this.nombre = nombre;
    }
    public float getSalarioFijo(){
        return this.salarioFijo;
    }
}
