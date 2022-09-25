package tp4.tp4_3;

public class EmpleadoXHora extends Empleado {
    private int hora;
    private float montoHora;
    public EmpleadoXHora(float salarioFijo, String nombre, int hora, float montoHora){
        super(salarioFijo, nombre);
        this.hora = hora;
        this.montoHora = montoHora;
    }

    public float getSalario(){
        return this.salarioFijo+(this.montoHora*this.hora);
    }
}
