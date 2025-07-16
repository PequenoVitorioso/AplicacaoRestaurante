package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            sentenca.setInt(1, cliente.getNumMesa());
            sentenca.setInt(2, cliente.getNotaFiscal().getNumNotaFiscal());
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
    
    public boolean editar(ClienteModel cliente){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL UPDATE
        String sql = "update cliente set numMesa = ?, notaFiscal = ? where codCliente = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, cliente.getNumMesa());
            sentenca.setInt(2, cliente.getNotaFiscal().getNumNotaFiscal());
            sentenca.setInt(3, cliente.getCodCliente());
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
    
    public boolean excluir(ClienteModel cliente){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL DELETE
        String sql = "delete from cliente where codCliente = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, cliente.getCodCliente());
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
    
    public ClienteModel selecionar(ClienteModel cliente){
        ClienteModel retorno = null;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL SELECT
        String sql = "select * from cliente where codCliente = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, cliente.getCodCliente());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                //RECUPERAR DADOS DO BANCO
                retorno = new ClienteModel();
                retorno.setCodCliente(result.getInt("codCliente"));
                retorno.setNumMesa(result.getInt("numMesa"));
                retorno.getNotaFiscal().setNumNotaFiscal(result.getInt("numNotaFiscal"));
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public ArrayList<ClienteModel> selecionarTodos(){
        ArrayList<ClienteModel> retorno = new ArrayList<>();
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL
        String sql = "select * from cliente";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            //RECUPERAR DADOS DO BANCO
            while(result.next()){
                ClienteModel pedido = new ClienteModel();
                pedido.setCodCliente(result.getInt("codCliente"));
                pedido.setNumMesa(result.getInt("numMesa"));
                pedido.getNotaFiscal().setNumNotaFiscal(result.getInt("numNotaFiscal"));
                retorno.add(pedido);
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }

    
}
