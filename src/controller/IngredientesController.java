package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.IngredientesModel;
import util.Conexao;

/**
 *
 * @author paulo
 */
public class IngredientesController {
    
    public boolean inserir(IngredientesModel ingrediente){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into ingredientes (materiaPrima, refeicao) values (?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, ingrediente.getMateriaPrima().getIdMateriaPrima());
            sentenca.setInt(2, ingrediente.getRefeicao().getIdRefeicao());
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
