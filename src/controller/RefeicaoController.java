package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MateriaPrimaModel;
import model.RefeicaoModel;
import util.Conexao;

/**
 *
 * @author paulo
 */
public class RefeicaoController {
    
    public boolean inserir(RefeicaoModel refeicao){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into refeicao (nome, valor) values (?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, refeicao.getNome());
            sentenca.setFloat(2, refeicao.getValor());
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
    
    public boolean editar(RefeicaoModel refeicao){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL UPDATE
        String sql = "update refeicao set nome = ?, valor = ? where idRefeicao = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, refeicao.getNome());
            sentenca.setFloat(2, refeicao.getvalor());
            sentenca.setInt(3, refeicao.getIdRefeicao());
            //EXECUTAR SENTENCA
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar: " + e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public boolean excluir(RefeicaoModel refeicao){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL DELETE
        String sql = "delete from refeicao where idRefeicao = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, refeicao.getIdRefeicao());
            //EXECUTAR SENTENCA
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public RefeicaoModel selecionar(RefeicaoModel refeicao){
        RefeicaoModel retorno = null;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL SELECT
        String sql = "select * from refeicao where idRefeicao = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, refeicao.getIdRefeicao());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                //RECUPERAR DADOS DO BANCO
                retorno = new RefeicaoModel();
                retorno.setIdRefeicao(result.getInt("idRefeicao"));
                retorno.setNome(result.getString("nome"));
                retorno.setValor(result.getFloat("valor"));
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public ArrayList<RefeicaoModel> selecionarTodos(){
        ArrayList<RefeicaoModel> retorno = new ArrayList<>();
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL
        String sql = "select * from refeicao";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            //RECUPERAR DADOS DO BANCO
            while(result.next()){
                RefeicaoModel refeicao = new RefeicaoModel();
                refeicao.setIdRefeicao(result.getInt("idRefeicao"));
                refeicao.setNome(result.getString("nome"));
                refeicao.setValor(result.getFloat("valor"));
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
}
