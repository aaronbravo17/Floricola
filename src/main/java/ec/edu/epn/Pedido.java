package ec.edu.epn;

import java.util.Enumeration;
import java.util.Vector;

public class Pedido {

    private String fechaPedido;
    private double precioTotalPedido;
    private Vector detalles = new Vector();

    public Pedido(String fechaPedido, double precioTotalPedido) {
        this.fechaPedido = fechaPedido;
        this.precioTotalPedido = precioTotalPedido;
    }



    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getPrecioTotalPedido() {
        return precioTotalPedido;
    }

    public void setPrecioTotalPedido(double precioTotalPedido) {
        this.precioTotalPedido = precioTotalPedido;
    }

    public void añadirDetalle(Detalle nuevoDetalle){
        detalles.add(nuevoDetalle);
    }

    @Override
    public String toString() {
        return "\n\nPedido{" + "fechaPedido=" + fechaPedido + ", precioTotalPedido=" + precioTotalPedido + ", detalles=" + detalles + '}';
    }

    public double calcularPrecioTotalPedido(){
        double totalPedido = 0;
        Enumeration detallesA = detalles.elements();
        while(detallesA.hasMoreElements()){
            Detalle each = (Detalle) detallesA.nextElement();
            totalPedido += each.getCantidad()*each.getPrecioUnitario();
        }
        return totalPedido;
    }
}
