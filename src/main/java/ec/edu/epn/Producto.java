package ec.edu.epn;

public class Producto {

    private String nombreProducto;

    public Producto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + '}';
    }



}
