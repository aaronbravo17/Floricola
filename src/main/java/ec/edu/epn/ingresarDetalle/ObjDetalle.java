package ec.edu.epn.ingresarDetalle;

public class ObjDetalle {
    private int cantidad;
    private String nombre;
    private float iva;
    private float subtotal;

    public ObjDetalle(int cantidad, String nombre, float iva, float subtotal) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.iva = iva;
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
