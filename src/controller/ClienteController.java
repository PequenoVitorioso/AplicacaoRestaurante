package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ClienteModel;
import util.Conexao;

/**
 *
 * @author paulo
 */
public class ClienteController {
    public boolean inserir(ClienteModel cliente){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into cliente (numMesa, notaFiscal) values (?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, cliente.getHora());
            sentenca.setInt(2, cliente.getCodCliente().getCodCliente());
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
