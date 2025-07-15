package model;

/**
 *
 * @author paulo
 */
public class PedidioModel {
    private int idPedido;
    private int hora;
    private ClienteModel codCliente;

    public PedidioModel() {
        idPedido = 0;
        hora = 0;
        codCliente = new ClienteModel();
    }

    public ClienteModel getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(ClienteModel codCliente) {
        this.codCliente = codCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
    
    
    
    
}
