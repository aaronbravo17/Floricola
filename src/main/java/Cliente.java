import java.util.Vector;

public class Cliente {


    private String cedulaCliente;
    private String nombreCliente;
    private Vector pedidos = new Vector();

    public Cliente(String cedulaCliente, String nombreCliente) {
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void añadirPedido(Pedido nuevoPedido){
        pedidos.add(nuevoPedido);
    }

    @Override
    public String toString() {
        return "\tCliente{" + "cedulaCliente=" + cedulaCliente + ", nombreCliente=" + nombreCliente + ", pedidos=" + pedidos + '}';
    }





}
