/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Controller.Conexao;
import Model.Marinheiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab2
 */
public class MarinheiroDAO {
    
    private Connection conn;
    private static final String INSERIR = "insert into Marinheiro(nome,habilitacao) values (?,?)";
    private static final String REMOVER = "delete from Marinheiro where id = ? ";
    private static final String EDITAR = "update Marinheiro set nome = ?, habilitacao = ? where id = ? ";
    private static final String BUSCAR = "select * from Marinheiro where id = ?";
    private static final String LISTARTODOS = "select * from Marinheiro ORDER BY id";
    
    public MarinheiroDAO() throws SQLException {
        this.conn = Conexao.conectar();
    }
    
    public void inserir(Marinheiro m) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(INSERIR);
        stmt.setString(1, m.getNome());
        stmt.setString(2, m.getHabilitacao());
        stmt.execute();
        
    }
    
    public Marinheiro buscar(Marinheiro m) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(BUSCAR);
        stmt.setInt(1, m.getId());
        ResultSet rs = stmt.executeQuery();
        Marinheiro marinheiro = null;
        if (rs.first()) {
            marinheiro = new Marinheiro(rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("habilitacao"));
        }
        return marinheiro;
    }
    
    public void editar(Marinheiro m) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(EDITAR);
        stmt.setString(1, m.getNome());
        stmt.setString(2, m.getHabilitacao());
        stmt.setInt(3, m.getId());
        stmt.execute();
    }
    
    public void remover(Marinheiro m) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(REMOVER);
        stmt.setInt(0, m.getId());
        stmt.execute();
    }
    
    public List<Marinheiro> listar() throws SQLException {
        List<Marinheiro> marinheiros = new ArrayList<>();
        PreparedStatement stmt = conn.prepareStatement(LISTARTODOS);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Marinheiro m
                    = new Marinheiro(rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("habilitacao"));
            marinheiros.add(m);
        }
        return marinheiros;
    }
    
    public static void main(String[] args) throws SQLException{
        Marinheiro m = new Marinheiro("Fernando","33333");
        MarinheiroDAO mdao = new MarinheiroDAO();
       // mdao.inserir(m);
       
       
        m.setId(1);
       /*
        m = mdao.buscar(m);
        System.out.println(m.getNome());
        */
       
       /* 
       m.setNome("Fulano");
       m.setHabilitacao("88888888");
       mdao.editar(m);
       */
       
       /*
       List<Marinheiro> marinheiros = mdao.listar();
     
       for(Marinheiro x : marinheiros){
           System.out.println(x.getNome());   
       }
*/
       
    }
    
}
