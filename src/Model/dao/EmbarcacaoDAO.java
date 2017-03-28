/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Controller.Conexao;
import Model.Embarcacao;
import Model.Marinheiro;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class EmbarcacaoDAO {

    Connection conn;
    private final String INSERIR = "insert into values (null,?,?,?)";
    
    public EmbarcacaoDAO() throws SQLException {
        conn = new Conexao().conectar();
    }
    
    
    public void inserir(Embarcacao e) throws SQLException{
        
        PreparedStatement stmt = conn.prepareStatement(INSERIR);
        stmt.setInt(1, e.getInscricao());
        stmt.setString(1, e.getNome());
        stmt.setInt(1, e.getProprietario());
        
        stmt.execute();       
        
        
    }
    
    
    public void main(String... args) throws SQLException{
    EmbarcacaoDAO edao = new EmbarcacaoDAO();
   
     
        
    }
    
    
}
