package model;

/**
 *
 * @author paulo
 */
public class Refeicao_MateriaPrimaModel {
    private MateriaPrimaModel ingrediente;
    private RefeicaoModel refeicao;

    public Refeicao_MateriaPrimaModel() {
        ingrediente = new MateriaPrimaModel();
        refeicao = new RefeicaoModel();
    }
    
    

    public MateriaPrimaModel getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(MateriaPrimaModel ingrediente) {
        this.ingrediente = ingrediente;
    }

    public RefeicaoModel getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(RefeicaoModel Refeicao) {
        this.refeicao = Refeicao;
    }
    
    
}
