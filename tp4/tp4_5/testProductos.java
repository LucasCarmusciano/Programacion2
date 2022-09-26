package tp4.tp4_5;

public class testProductos {
    public static void main(String[] args) {
        ProductoCongeladoXAgua pcxagua = new ProductoCongeladoXAgua(28112001, 1, 0000, "Pehuajo", 1234, -60, 55);
        pcxagua.getInformacion();
        System.out.println("---------------");
        ProductoFresco pf = new ProductoFresco(2001, 2, 0001, "Tandil");
        pf.getInformacion();
    }
}
