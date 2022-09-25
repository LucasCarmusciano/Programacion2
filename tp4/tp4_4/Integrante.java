package Programacion2.tp4.tp4_4;

public abstract class Integrante {
    protected String nombre;
    protected int numPasaporte;
    protected String fechaNacimiento;
    protected Estado estado;

    public Integrante(String nombre, int numPasaporte, String fechaNacimiento, Estado estado){
        this.nombre = nombre;
        this.numPasaporte = numPasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public void setEstado(Estado e){
        this.estado = e;
    }
}
