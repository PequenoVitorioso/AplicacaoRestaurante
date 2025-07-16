package model;

/**
 *
 * @author paulo
 */
public class IngredientesModel {
    private MateriaPrimaModel materiaPrima;
    private RefeicaoModel refeicao;

    public IngredientesModel() {
        materiaPrima = new MateriaPrimaModel();
        refeicao = new RefeicaoModel();
    }
    
    

    public MateriaPrimaModel getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrimaModel materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public RefeicaoModel getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(RefeicaoModel Refeicao) {
        this.refeicao = Refeicao;
    }
    
    
}
