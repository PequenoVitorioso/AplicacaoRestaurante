package model;

/**
 *
 * @author paulo
 */
public class RefeicaoModel {
    private int idRefeicao;
    private String nome;
    private float valor;

    public RefeicaoModel() {
        idRefeicao = 0;
        nome = "";
        valor = 0;
    }

    public int getIdRefeicao() {
        return idRefeicao;
    }

    public void setIdRefeicao(int idRefeicao) {
        this.idRefeicao = idRefeicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
