package model;

/**
 *
 * @author paulo
 */
//    |Refeicao_Pedido|
public class ComandaModel {
    private RefeicaoModel refeicao;
    private PedidoModel pedido;

    public ComandaModel() {
        refeicao = new RefeicaoModel();
        pedido = new PedidoModel();
    }

    public RefeicaoModel getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(RefeicaoModel refeicao) {
        this.refeicao = refeicao;
    }

    public PedidoModel getPedido() {
        return pedido;
    }

    public void setPedido(PedidoModel pedido) {
        this.pedido = pedido;
    }
    
    
    
}
