package tp4.tp4_3;

public class EmpleadoXComision extends Empleado {
    private int porcentaje;
    private int cantVentas;
    public EmpleadoXComision(float salarioFijo, String nombre, int porcentaje, int cantVentas){
        super(salarioFijo, nombre);
        this.porcentaje = porcentaje;
        this.cantVentas = cantVentas;
    }
    public float getSalario(){
        return this.salarioFijo+(((this.porcentaje*this.cantVentas)/100)*this.salarioFijo);
    }
}
