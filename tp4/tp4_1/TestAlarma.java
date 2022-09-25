package tp4.tp4_1;

public class TestAlarma {
    public static void main(String[] args) {
        Timbre timbre = new Timbre();
        Luz luz = new Luz();
        Alarma a1 = new Alarma(false, true, false, timbre);
        AlarmaLuminosa a2 = new AlarmaLuminosa(false, false, true, timbre, luz);
        a1.comprobar();
        a2.comprobar();
    }
}
