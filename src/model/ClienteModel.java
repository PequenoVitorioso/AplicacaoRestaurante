package model;

/**
 *
 * @author paulo
 */
/*

OPA RAPHAEL BELEZA?

*/
public class ClienteModel {
    private int codCliente;
    private int numMesa;
    private String nome;

    public ClienteModel() {
        codCliente = 0;
        numMesa = 0;
        nome = "";
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
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
