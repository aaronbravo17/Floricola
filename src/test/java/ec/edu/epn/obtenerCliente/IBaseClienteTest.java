package ec.edu.epn.obtenerCliente;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IBaseClienteTest {
    private ObjCLiente cliente;

    @Test
    public void given_an_id_when_request_client_then_data()
    {
        IBaseCliente c = Mockito.mock(IBaseCliente.class);
        Mockito.when(c.clientedata("1717663080")).thenReturn(cliente);
        assertEquals(cliente,c.clientedata("1717663080"));
        System.out.println("Datos de cliente obtenidos correctamente");
    }





}