public class Computadora extends Producto{
    ///Procesador, Memoria RAM y Tamaño de
    //Disco
    private String procesador;
    private int ram;
    private int tamDisc;

    public Computadora(String nombre, String marca, float precio, int stock, String procesador, int ram, int tamDisc) {
        super(nombre, marca, precio, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.tamDisc = tamDisc;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getTamDisc() {
        return tamDisc;
    }

    public void setTamDisc(int tamDisc) {
        this.tamDisc = tamDisc;
    }
}
