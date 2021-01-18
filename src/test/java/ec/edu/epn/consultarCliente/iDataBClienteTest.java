package ec.edu.epn.consultarCliente;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class iDataBClienteTest {

    @Test
    public void given_an_ID_when_IF_exist_then_YES()
    {
        IDataBCliente c = Mockito.mock(IDataBCliente.class);
        ProcesadorCliente procesador = new ProcesadorCliente(c);
        Mockito.when(c.consultarCliente(Mockito.any())).thenReturn(new Cliente(Cliente.ExisteCliente.YES));

        assertTrue(procesador.ejecutarConsulta("1717663080"));

    }
    @Test

    public void given_an_ID_when_IF_Dont_exist_then_NO()
    {
        IDataBCliente c = Mockito.mock(IDataBCliente.class);
        ProcesadorCliente procesador = new ProcesadorCliente(c);
        Mockito.when(c.consultarCliente(Mockito.any())).thenReturn(new Cliente(Cliente.ExisteCliente.NO));

        assertFalse(procesador.ejecutarConsulta("0123456789"));

    }



}