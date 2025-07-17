package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.*;
import util.Conexao;

/**
 *
 * @author paulo
 */
public class CaixaContoller {
    public boolean inserir(CaixaModel caixa){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into caixa (valorTotal, data, formPagamento, cliente) values (?,?,?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setFloat(1, caixa.getValorTotal());
            sentenca.setString(2, caixa.toStringDataVenda());
            sentenca.setString(3, caixa.getFormPagamento());
            sentenca.setInt(4, caixa.getCliente().getCodCliente());
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
    
    public boolean editar(CaixaModel caixa){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL UPDATE
        String sql = "update caixa set valorTotal = ?, data = ?, formPagamento = ?, cliente = ? where numNotaFiscal = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setFloat(1, caixa.getValorTotal());
            sentenca.setString(2, caixa.toStringDataVenda());
            sentenca.setString(3, caixa.getFormPagamento());
            sentenca.setInt(4, caixa.getCliente().getCodCliente());
            sentenca.setInt(5, caixa.getNumNotaFiscal());
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
    
    public boolean excluir(CaixaModel caixa){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL DELETE
        String sql = "delete from caixa where numNotaFiscal = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, caixa.getNumNotaFiscal());
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
    
    public CaixaModel selecionar(CaixaModel caixa){
        CaixaModel retorno = null;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL SELECT
        String sql = "select * from caixa where numNotaFiscal = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, caixa.getNumNotaFiscal());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                //RECUPERAR DADOS DO BANCO
                retorno = new CaixaModel();
                retorno.setNumNotaFiscal(result.getInt("numNotaFiscal"));
                retorno.setFormPagamento(result.getString("formPagamento"));
                retorno.setValorTotal(result.getFloat("valorTotal"));
                retorno.setData(result.getDate("data"));
                retorno.getCliente().setCodCliente(result.getInt("codCliente"));
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public ArrayList<CaixaModel> selecionarTodos(){
        ArrayList<CaixaModel> retorno = new ArrayList<>();
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL
        String sql = "select * from caixa";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            //RECUPERAR DADOS DO BANCO
            while(result.next()){
                CaixaModel caixa = new CaixaModel();
                caixa.setNumNotaFiscal(result.getInt("numNotaFiscal"));
                caixa.setFormPagamento(result.getString("formPagamento"));
                caixa.setValorTotal(result.getFloat("valorTotal"));
                caixa.setData(result.getDate("data"));
                caixa.getCliente().setCodCliente(result.getInt("codCliente"));
                retorno.add(caixa);
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
}
