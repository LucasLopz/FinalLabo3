public class Accesorios extends Producto{
    private String conexion;
    private String Compatibilidad;

    public Accesorios(String nombre, String marca, float precio, int stock, String conexion, String compatibilidad) {
        super(nombre, marca, precio, stock);
        this.conexion = conexion;
        Compatibilidad = compatibilidad;
    }

    public Accesorios(String conexion, String compatibilidad) {
        this.conexion = conexion;
        Compatibilidad = compatibilidad;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getCompatibilidad() {
        return Compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        Compatibilidad = compatibilidad;
    }
}
