package tp4.tp4_4;

public class testSeleccionFutbol {
    public static void main(String[] args) {
        Estado ec = new EstadoConcentracion();
        Estado ev = new EstadoViajando();
        Estado epo = new EstadoPaisOrigen();

        Futbolista f1 = new Futbolista("Lucas", 2001, "281101", ec, "delantero", true, 21);
        System.out.println(f1);
        f1.setEstado(epo);
        System.out.println(f1);
        f1.setEstado(ev);
    }
}
