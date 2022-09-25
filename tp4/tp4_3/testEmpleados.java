package tp4.tp4_3;

public class testEmpleados {
    public static void main(String[] args) {
        EmpleadoContratado ec = new EmpleadoContratado(3000, "Lucas");
        EmpleadoXComision exc = new EmpleadoXComision(1000, "Leonel", 5, 5);
        EmpleadoXHora exh = new EmpleadoXHora(2000, "Claudio", 300, 2);

        System.out.println(ec);
        System.out.println(exc);
        System.out.println(exh);


    }
}
