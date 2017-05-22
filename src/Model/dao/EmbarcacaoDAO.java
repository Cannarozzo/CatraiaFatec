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
import java.util.List;

/**
 *
 * @author Matheus
 */
public class EmbarcacaoDAO {

    // Consertar o Field Incricao para Inscricao
    Connection conn;
    private final String INSERCAO = "insert into Embarcacao(incricao,nome,id_responsavel) values (?,?,?)";
    private final String SELECAO = "select * from Embarcacao where id = ? ";
    private final String EDICAO = "update Embarcacao set incricao = ?, nome = ? , id_responsavel = ? where id = ? ";
    private final String REMOCAO = "delete from Embarcacao where id = ? ";

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

    public Embarcacao buscarEmbarcacao(Embarcacao e) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(SELECAO);
        stmt.setInt(1, e.getId());
        ResultSet rs = stmt.executeQuery();
        Embarcacao embarcacao = null;
        if (rs.first()) {
            embarcacao = new Embarcacao(rs.getInt("id"), rs.getInt("incricao"), rs.getString("nome"), rs.getInt("id_responsavel"));
        }

        return embarcacao;
    }

    public void editar(Embarcacao e) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(EDICAO);
        stmt.setInt(1, e.getInscricao());
        stmt.setString(2, e.getNome());
        stmt.setInt(3, e.getResponsavelId());
        stmt.setInt(4, e.getId());
        stmt.execute();
    }

    public void remover(Embarcacao e) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(REMOCAO);
        stmt.setInt(1, e.getId());
        stmt.execute();

    }

    public List<Embarcacao> listar() {

        return null;
    }

    public static void main(String[] args) throws SQLException {
        /*
        Embarcacao Inserir
        EmbarcacaoDAO edao = new EmbarcacaoDAO();
        Embarcacao e = new Embarcacao(1,"USS Zoeira", 1);
        edao.inserir(e);
         */

 /* Buscar Embarcacao
        EmbarcacaoDAO edao = new EmbarcacaoDAO();
        Embarcacao e = new Embarcacao();
        e.setId(1);        
        e = edao.buscarEmbarcacao(e);        
        if(e == null){
            System.out.println("null");
        }else{
            System.out.println(e.getId());
        }
        
         */
 /*        
        EmbarcacaoDAO edao = new EmbarcacaoDAO();
        Embarcacao e = new Embarcacao();
        e.setInscricao(2);
        e.setNome("BR BR");
        e.setResponsavel(1);
        e.setId(1);
        edao.editar(e);
         */
         
        EmbarcacaoDAO edao = new EmbarcacaoDAO();
        Embarcacao e = new Embarcacao();
        e.setId(1);
        edao.remover(e);

    }
}
