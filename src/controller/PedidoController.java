package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PedidoModel;
import util.Conexao;
/**
 *
 * @author paulo
 */
public class PedidoController {
    
    public boolean inserir(PedidoModel pedido){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into pedido (hora, codCliente) values (?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, pedido.getHora());
            sentenca.setInt(2, pedido.getCodCliente().getCodCliente());
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
    
    public boolean editar(PedidoModel pedido){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL UPDATE
        String sql = "update pedido set hora = ?, codCliente = ? where idPedido = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, pedido.getHora());
            sentenca.setInt(2, pedido.getCodCliente().getCodCliente());
            
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
    
    public boolean excluir(PedidoModel pedido){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL DELETE
        String sql = "delete from pedido where idPedido = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, pedido.getIdPedido());
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
    
    public PedidoModel selecionar(PedidoModel pedido){
        PedidoModel retorno = null;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL SELECT
        String sql = "select * from pedido where idPedido = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, pedido.getIdPedido());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                //RECUPERAR DADOS DO BANCO
                retorno = new PedidoModel();
                retorno.setIdPedido(result.getInt("idPedido"));
                retorno.setHora(result.getInt("hora"));
                retorno.getCodCliente().setCodCliente(result.getInt("codCliente"));
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public ArrayList<PedidoModel> selecionarTodos(){
        ArrayList<PedidoModel> retorno = new ArrayList<>();
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL
        String sql = "select * from pedido";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            //RECUPERAR DADOS DO BANCO
            while(result.next()){
                PedidoModel pedido = new PedidoModel();
                pedido.setIdPedido(result.getInt("idPedido"));
                pedido.setHora(result.getInt("hora"));
                pedido.getCodCliente().setCodCliente(result.getInt("codCliente"));
                retorno.add(pedido);
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public int selecionarUltimoId() {
        int retorno = 0;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "select max(idPedido) as ultimo from pedido";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                retorno = result.getInt("ultimo");
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
}
