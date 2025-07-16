package model;

/**
 *
 * @author paulo
 */
public class Refeicao_PedidoModel {
    private RefeicaoModel refeicao;
    private PedidoModel pedido;

    public Refeicao_PedidoModel() {
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
