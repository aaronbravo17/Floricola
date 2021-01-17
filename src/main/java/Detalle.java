public class Detalle {


    private int cantidad;
    private Producto producto;
    private double precioUnitario;
    private double precioTotal;

    public Detalle(int cantidad, Producto producto, double precioUnitario, double precioTotal) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double calcularPrecioTotalDetalle(){
        return getCantidad()*getPrecioUnitario();
    }

    @Override
    public String toString() {
        return "\nDetalle{" + "cantidad=" + cantidad + ", producto=" + producto + ", precioUnitario=" + precioUnitario + ", precioTotal=" + precioTotal + '}';
    }





}
