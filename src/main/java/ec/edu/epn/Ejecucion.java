package ec.edu.epn;
public class Ejecucion {


    public static void main(String args[]){
        Producto prod1 = new Producto("Rosas");
        Producto prod2 = new Producto("Claveles");
        Producto prod3 = new Producto("Spry");
        Producto prod4 = new Producto("Orquideas");

        Detalle detalle1 = new Detalle(2, prod4, 1.25, 0);
        detalle1.setPrecioTotal(detalle1.calcularPrecioTotalDetalle());
        //System.out.println(detalle1);

        Detalle detalle2 = new Detalle(3, prod3, 2.30, 0);
        detalle2.setPrecioTotal(detalle2.calcularPrecioTotalDetalle());
        //System.out.println(detalle2);

        Detalle detalle3 = new Detalle(4, prod1, 7.45, 0);
        detalle3.setPrecioTotal(detalle3.calcularPrecioTotalDetalle());
        //System.out.println(detalle3);

        Detalle detalle4 = new Detalle(6, prod2, 2.20, 0);
        detalle4.setPrecioTotal(detalle4.calcularPrecioTotalDetalle());
        //System.out.println(detalle4);

        Detalle detalle5 = new Detalle(9, prod3, 3.64, 0);
        detalle5.setPrecioTotal(detalle5.calcularPrecioTotalDetalle());
        //System.out.println(detalle5);

        Detalle detalle6 = new Detalle(15, prod2, 9.25, 0);
        detalle6.setPrecioTotal(detalle6.calcularPrecioTotalDetalle());
        //System.out.println(detalle6);

        Detalle detalle7 = new Detalle(8, prod3, 10, 0);
        detalle7.setPrecioTotal(detalle7.calcularPrecioTotalDetalle());

        Pedido pedido1 = new Pedido("15/01/2020", 0);
        pedido1.añadirDetalle(detalle1);
        pedido1.añadirDetalle(detalle2);
        pedido1.añadirDetalle(detalle3);
        pedido1.setPrecioTotalPedido(pedido1.calcularPrecioTotalPedido());
        //System.out.println(pedido1);

        Pedido pedido2 = new Pedido("17/03/2020", 0);
        pedido2.añadirDetalle(detalle4);
        pedido2.añadirDetalle(detalle2);
        pedido2.setPrecioTotalPedido(pedido2.calcularPrecioTotalPedido());
        //System.out.println(pedido2);

        Pedido pedido3 = new Pedido("12/04/2020", 0);
        pedido3.añadirDetalle(detalle5);
        pedido3.setPrecioTotalPedido(pedido3.calcularPrecioTotalPedido());
        //System.out.println(pedido3);

        Pedido pedido4 = new Pedido("20/12/2020", 0);
        pedido4.añadirDetalle(detalle1);
        pedido4.añadirDetalle(detalle2);
        pedido4.añadirDetalle(detalle3);
        pedido4.añadirDetalle(detalle4);
        pedido4.añadirDetalle(detalle5);
        pedido4.setPrecioTotalPedido(pedido4.calcularPrecioTotalPedido());
        //System.out.println(pedido4);

        Pedido pedido5 = new Pedido("30/12/2020", 0);
        pedido5.añadirDetalle(detalle1);
        pedido5.añadirDetalle(detalle7);
        pedido5.añadirDetalle(detalle6);
        pedido5.setPrecioTotalPedido(pedido5.calcularPrecioTotalPedido());
        //System.out.println(pedido5);

        Cliente cliente1 = new Cliente("1304720749", "Yaqueline Alava");
        cliente1.añadirPedido(pedido1);
        cliente1.añadirPedido(pedido2);
        System.out.println(cliente1);

        Cliente cliente2 = new Cliente("0400402830", "Medardo Viteri");
        cliente2.añadirPedido(pedido3);
        cliente2.añadirPedido(pedido4);
        cliente2.añadirPedido(pedido5);
        System.out.println(cliente2);
    }

}
