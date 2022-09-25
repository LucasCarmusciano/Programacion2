package tp3.tp3_1;

public class PersonaEmpleada extends Persona {
    private int cantEncuestasHechas = 0;
    public PersonaEmpleada(int dni) {
        super(dni);
    }
    public int getDni() {
        return super.getDni();
    }
    public int getCantEncuestasHechas(){
        return cantEncuestasHechas;
    }
    public void sumaEncuesta(){
        cantEncuestasHechas++;
    }
}
