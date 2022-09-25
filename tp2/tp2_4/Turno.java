package tp2.tp2_4;

import java.sql.Date;

public class Turno {
    private Cancha cancha;
    private Date fecha;
    private Usuario usuario;
    private static final double descuento=0.9;


    public Turno(Cancha cancha, long fecha, Usuario usuario) {
        this.cancha = cancha;
        this.fecha = new Date(fecha);
        this.usuario = usuario;
    }
    public Date getFecha(){
        return fecha;
    }
    public double getPrecio(){
        if(usuario.socio()){
            return cancha.getPrecio()*descuento;
        }else{
            return cancha.getPrecio();
        }
    }
}
