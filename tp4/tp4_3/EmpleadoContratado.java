package tp4.tp4_3;

public class EmpleadoContratado extends Empleado{
    public EmpleadoContratado(float salarioFijo, String nombre){
        super(salarioFijo, nombre);
    }
    public float getSalario(){
        return this.salarioFijo;
    }
}
