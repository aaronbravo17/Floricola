package ec.edu.epn.consultarCliente;

public class Cliente {
    enum ExisteCliente
    {
        YES,NO
    }
    private ExisteCliente existe;


    public Cliente(ExisteCliente existe) {
        this.existe = existe;
    }

    public ExisteCliente getExiste() {
        return existe;
    }
}
