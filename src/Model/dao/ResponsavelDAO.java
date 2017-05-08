/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Controller.Conexao;
import Model.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResponsavelDAO {

    private Connection conn;
    private static final String INSERIR = "insert into Responsavel(nome,senha) values (?,?)";
    private static final String REMOVER = "delete from Responsavel where id = ? ";
    private static final String ALTERAR = "";
    private static final String MOSTRAR = "";

    public ResponsavelDAO() throws SQLException {
        this.conn = Conexao.conectar();
    }
    public void inserir(Responsavel r) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(INSERIR);
        stmt.setString(1, r.getNome());
        stmt.setString(2, r.getSenha());
        stmt.execute();
    }
    public void remover(Responsavel r) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(REMOVER);
        stmt.setInt(1, r.getId());
        stmt.execute();
    }
    
    public void alterar(Responsavel r){
        
    }
    
    public void getResponsavel(Responsavel r){
        
    }
    
    public static void main(String... args) throws SQLException {
        /* 1
        ResponsavelDAO rdao = new ResponsavelDAO();
         Responsavel r = new Responsavel("Matheus", "123");
         rdao.inserir(r);
        */
        
        /*
        Responsavel r = new Responsavel();
        r.setId(1);
        rdao.remover(r);
        */
    }
}
