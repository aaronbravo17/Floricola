package ec.edu.epn.obtenerCliente;




public class ProcObtencionCli {
    private IBaseCliente cliente;

    public ObjCLiente ejecutarConsula(String cedula){
        ObjCLiente c = cliente.clientedata(cedula);
        return c;
    }

}
