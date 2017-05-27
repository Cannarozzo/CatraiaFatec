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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResponsavelDAO {

    private Connection conn;
    private static final String INSERIR = "insert into Responsavel(email,nome,senha) values (?,?,?)";
    private static final String REMOVER = "delete from Responsavel where id = ? ";
    private static final String ALTERAR = "update Responsavel set email = ?, nome = ?, senha = ? where id = ? ";
    private static final String PEGAR = "select * from Responsavel where id = ?";
    private static final String LISTARTODOS = "select * from Responsavel ORDER BY id";

    public ResponsavelDAO() throws SQLException {
        this.conn = Conexao.conectar();
    }

    public void inserir(Responsavel r) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(INSERIR);
        stmt.setString(1, r.getEmail());
        stmt.setString(2, r.getNome());
        stmt.setString(3, r.getSenha());
        stmt.execute();
    }

    public void remover(Responsavel r) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(REMOVER);
        stmt.setInt(1, r.getId());
        stmt.execute();
        stmt.close();
        this.conn.close();
    }

    public void editar(Responsavel r) throws SQLException {
        try {
            PreparedStatement stmt = conn.prepareStatement(ALTERAR);
            stmt.setString(1, r.getNome());
            stmt.setString(2, r.getSenha());
            stmt.setInt(3, r.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.conn.close();
        }
    }

    public Responsavel buscar(Responsavel r) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(PEGAR);
        stmt.setInt(1, r.getId());
        ResultSet rs = stmt.executeQuery();

        Responsavel responsavel = new Responsavel();
        if (rs.first()) {
            responsavel
                    = new Responsavel(rs.getInt("id"),
                            rs.getString("email"),
                            rs.getString("nome"),
                            rs.getString("senha"));
        }
        return responsavel;
    }

    public List<Responsavel> listar() throws SQLException {
        List<Responsavel> responsaveis = new ArrayList<>();
        PreparedStatement stmt = conn.prepareStatement(LISTARTODOS);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Responsavel r
                    = new Responsavel(rs.getInt("id"),
                            rs.getString("email"),
                            rs.getString("nome"),
                            rs.getString("senha"));
            responsaveis.add(r);
        }
        return responsaveis;

    }

    public static void main(String... args) throws SQLException {
        /* Inserir
         Responsavel r = new Responsavel("Matheus", "123");
         rdao.inserir(r);
         */

 /* pegar
        ResponsavelDAO rdao = new ResponsavelDAO();
        Responsavel r = new Responsavel();
        r.setId(1);
        r = rdao.getResponsavel(r);
        System.out.println(r.getNome());
         */
        List<Responsavel> rs = new ResponsavelDAO().listar();
        for (Responsavel r : rs) {
            System.out.println(r.getId() + " " + r.getNome() + " " + r.getSenha());
        }

        /* update
        ResponsavelDAO rdao = new ResponsavelDAO();
        Responsavel r = new Responsavel(1,"Felipe","321");
        rdao.alterar(r);
         */
 /* Remover
        Responsavel r = new Responsavel();
        r.setId(1);
        rdao.remover(r);
         */
    }
}
