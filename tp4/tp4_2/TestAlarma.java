package tp4.tp4_2;

import java.util.ArrayList;

public class TestAlarma {
    public static void main(String[] args) {
        Timbre timbre = new Timbre();
        Sensor s1 = new Sensor("cocina", false, true, false, timbre);
        Sensor s2 = new Sensor("living", false, false, false, timbre);
        Sensor s3 = new Sensor("pieza", false, true, false, timbre);
        Sensor s4 = new Sensor("patio", false, false, false, timbre);

        ArrayList<Sensor> sensores = new ArrayList<>();
        sensores.add(s1);
        sensores.add(s2);
        sensores.add(s3);
        sensores.add(s4);

        Alarma alarma = new Alarma(sensores);
        alarma.comprobar();
    }
}
