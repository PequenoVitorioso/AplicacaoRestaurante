package model;

/**
 *
 * @author paulo
 */
public class ClienteModel {
    private int codCliente;
    private int numMesa;
    private CaixaModel notaFiscal;

    public ClienteModel() {
        codCliente = 0;
        numMesa = 0;
        notaFiscal = new CaixaModel();
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public CaixaModel getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(CaixaModel notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
    
}
