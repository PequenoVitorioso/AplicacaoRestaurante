package model;

/**
 *
 * @author paulo
 */
//    |Refeicao_Pedido|
public class ComandaModel {
    private RefeicaoModel refeicao;
    private PedidoModel pedido;
    private int quantidade;

    public ComandaModel() {
        refeicao = new RefeicaoModel();
        pedido = new PedidoModel();
        quantidade = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
