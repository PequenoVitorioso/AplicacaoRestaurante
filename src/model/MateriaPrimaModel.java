package model;

/**
 *
 * @author paulo
 */
public class MateriaPrimaModel {
    private int idMateriaPrima;
    private String nome;
    private float custoPorKG;

    public MateriaPrimaModel() {
        idMateriaPrima = 0;
        nome = "";
        custoPorKG = 0;
    }

    public int getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public float getCustoPorKG() {
        return custoPorKG;
    }

    public void setCustoPorKG(float custoPorKG) {
        this.custoPorKG = custoPorKG;
    }
    
    
}
