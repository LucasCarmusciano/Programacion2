package tp1.tp1_2;

public class TestElectrodomestico {
    public static void main(String[] args){
        Electrodomestico e1 = new Electrodomestico("winky",150,"violeta",340,544);
        System.out.println("El nombre del electrodomestico es:"+e1.getNombre());
        e1.getIndiceConsumo();
        e1.getIndiceGama();
    }
}
