package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ComandaModel;
import util.Conexao;

/**
 *
 * @author paulo
 */
public class ComandaController {
    
    public boolean inserir(ComandaModel comanda){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into comanda (refeicao, pedido, quantidade) values (?,?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, comanda.getRefeicao().getIdRefeicao());
            sentenca.setInt(2, comanda.getPedido().getIdPedido());
            sentenca.setInt(3, comanda.getQuantidade());
            //EXECUTAR SENTENCA
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL: " + e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
}
