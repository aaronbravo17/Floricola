package ec.edu.epn.ingresarDetalle;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IBaseDetalleTest {
    private ObjProducto producto;
    private ObjDetalle detalle;

    @Test
    public void given_an_IDProduct_when_request_then_OK()
    {
        IBaseProducto p = Mockito.mock(IBaseProducto.class);
        Mockito.when(p.datosProducto("123")).thenReturn(producto);
        assertEquals(producto, p.datosProducto("123"));
        System.out.println("datos de producto obtenidos correctamente");
    }

    @Test
    public void given_a_detail_when_request_then_OK()
    {
        IBaseDetalle d = Mockito.mock(IBaseDetalle.class);
        Mockito.when(d.insertarDetalle(detalle)).thenReturn(true);
        assertTrue(d.insertarDetalle(detalle));
        System.out.println("datos de detalle ingresados correctamente");
    }

}