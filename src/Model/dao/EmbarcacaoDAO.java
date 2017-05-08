/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Controller.Conexao;
import Model.Embarcacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class EmbarcacaoDAO {

    Connection conn;
    private final String INSERCAO = "insert into Embarcacao(instricao,nome,responsavel) (?,?,?)";
    private final String SELECAO = "select * from Embarcacao where id = ? ";
    private final String EDICAO = "update Embarcacao set inscricao = ?, nome = ? , responsavel = ? where id = ? ";
    private final String REMOCAO = "delete from Embarcao where id = ? ";
    
    public EmbarcacaoDAO() throws SQLException {
        conn = new Conexao().conectar();
    }

    public void inserir(Embarcacao e) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(INSERCAO);
        stmt.setInt(1, e.getInscricao());
        stmt.setString(2, e.getNome());
        stmt.setInt(3, e.getResponsavelId());
        stmt.execute();
        stmt.close();

    }
public Embarcacao buscarEmbarcacao(Embarcacao e) throws SQLException{
    PreparedStatement stmt = conn.prepareStatement(SELECAO);
    stmt.setInt(1, e.getInscricao());
    stmt.setString(2, "nome");
    stmt.setInt(3, e.getResponsavelId());
    ResultSet rs = stmt.executeQuery();
    Embarcacao embarcacao = null;
    if(rs.first())
        embarcacao = new Embarcacao(rs.getInt("id"),rs.getInt("inscricao"),rs.getString("nome"),rs.getInt("id_responsavel"));
    
   return embarcacao;
}
    
    public static void main(String[] args) throws SQLException {
        EmbarcacaoDAO edao = new EmbarcacaoDAO();
        
        edao.inserir(new Embarcacao(1, "USS Zoeira", 1));
    }
}
