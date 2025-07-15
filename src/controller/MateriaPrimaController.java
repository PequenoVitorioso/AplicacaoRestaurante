package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.MateriaPrimaModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.Conexao;

/**
 *
 * @author paulo
 */
public class MateriaPrimaController {
    
    public boolean inserir(MateriaPrimaModel MP){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into materiaPrima (nome, custoPorKG) values (?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, MP.getNome());
            sentenca.setFloat(2, MP.getCustoPorKG());
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
    
    public boolean editar(MateriaPrimaModel MP){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL UPDATE
        String sql = "update materiaPrima set nome = ?, custoPorKG = ? where idMateriaPrima = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, MP.getNome());
            sentenca.setFloat(2, MP.getCustoPorKG());
            sentenca.setInt(3, MP.getIdMateriaPrima());
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
    
    public boolean excluir(MateriaPrimaModel MP){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL DELETE
        String sql = "delete from materiaPrima where idMateriaPrima = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, MP.getIdMateriaPrima());
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
    
    public MateriaPrimaModel selecionar(MateriaPrimaModel MP){
        MateriaPrimaModel retorno = null;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL SELECT
        String sql = "select * from materiaPrima where idMateriaPrima = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setInt(1, MP.getIdMateriaPrima());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                //RECUPERAR DADOS DO BANCO
                retorno = new MateriaPrimaModel();
                retorno.setIdMateriaPrima(result.getInt("idMateriaPrima"));
                retorno.setNome(result.getString("nome"));
                retorno.setCustoPorKG(result.getFloat("custoPorKG"));
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public ArrayList<MateriaPrimaModel> selecionarTodos(){
        ArrayList<MateriaPrimaModel> retorno = new ArrayList<>();
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL
        String sql = "select * from materiaPrima";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            //RECUPERAR DADOS DO BANCO
            while(result.next()){
                MateriaPrimaModel MP = new MateriaPrimaModel();
                MP.setIdMateriaPrima(result.getInt("idMateriaPrima"));
                MP.setNome(result.getString("nome"));
                MP.setCustoPorKG(result.getFloat("custoPorKG"));
                retorno.add(MP);
            }            
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
}
