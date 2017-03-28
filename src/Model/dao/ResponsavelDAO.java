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
    private static final String INSERIR = "insert into values (null,?,?)";
    private static final String REMOVER = "delete from Responsavel where cd_responsavel = ? ";
    private static final String ALTERAR = "";
    private static final String MOSTRAR = "";

    public ResponsavelDAO() throws SQLException {
        this.conn = Conexao.conectar();
    }

    public void inserir(Responsavel r) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(INSERIR);
        stmt.setString(0, r.getNome());
        stmt.setString(1, r.getSenha());
        stmt.execute();

    }

    
  public void remover(Responsavel r) throws SQLException{
     PreparedStatement stmt = conn.prepareStatement(REMOVER);
     stmt.setInt(0, r.getId());
     stmt.execute();
     
  }
    
    
    public static void main(String... args) throws SQLException {

        ResponsavelDAO rdao = new ResponsavelDAO();
        Responsavel r = new Responsavel("Matheus", "123");
        rdao.inserir(r);

    }

}
