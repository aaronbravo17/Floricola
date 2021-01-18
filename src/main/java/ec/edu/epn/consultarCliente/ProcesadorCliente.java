package ec.edu.epn.consultarCliente;

public class ProcesadorCliente {
    private IDataBCliente datocli;

    public ProcesadorCliente(IDataBCliente datocli) {
        this.datocli = datocli;
    }
    public boolean ejecutarConsulta(String cedula){
        Cliente cliente = datocli.consultarCliente(new SolicitarCliente(cedula));
        if(cliente.getExiste()==Cliente.ExisteCliente.YES)
            return true;
        else
            return false;
    }
}
