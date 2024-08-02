public class Telefono extends Producto{
    ///Sistema Operativo, Capacidad de Almacenamiento y Tamaño de Pantalla
    private String systemop;
    private int alm;
    private int tamañopant;

    public Telefono(String nombre, String marca, float precio, int stock, String systemop, int alm, int tamañopant) {
        super(nombre, marca, precio, stock);
        this.systemop = systemop;
        this.alm = alm;
        this.tamañopant = tamañopant;
    }

    public String getSystemop() {
        return systemop;
    }

    public void setSystemop(String systemop) {
        this.systemop = systemop;
    }

    public int getAlm() {
        return alm;
    }

    public void setAlm(int alm) {
        this.alm = alm;
    }

    public int getTamañopant() {
        return tamañopant;
    }

    public void setTamañopant(int tamañopant) {
        this.tamañopant = tamañopant;
    }


}
