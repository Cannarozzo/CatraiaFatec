/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Controller.Conexao;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    // PROVAVEL PADRÃO a ser seguido
    //Teste de Try With Resources
    private static final String INSERIR = "insert into Usuario(email,senha,nome,credencial) values (?,?,?,?)";
    private static final String REMOVER = "delete from Usuario where id = ? ";
    private static final String EDITAR = "update Usuario set email = ? , senha = ?, nome = ?, credencial = ? where id = ? ";
    private static final String BUSCAR = "select * from Usuario where nome = ?";
    private static final String LISTARTODOS = "select * from Usuario ORDER BY id";
    
    private static final String LOGIN = "select * from Usuario where email = ? and senha = ? ";

    
    
    public Usuario logar(Usuario u){
       PreparedStatement stmt;

        try (Connection conn = Conexao.conectar()) {
            stmt = conn.prepareStatement(LOGIN);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            ResultSet rs = stmt.executeQuery();

            Usuario usuario = new Usuario();
            if (rs.first()) {
                usuario
                        = new Usuario(rs.getInt("id"),
                                rs.getString("email"),
                                rs.getString("senha"),
                                rs.getString("nome"),
                                rs.getString("credencial"));
            }
            return usuario;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void inserir(Usuario u) {

        PreparedStatement stmt;
        try (Connection conn = Conexao.conectar()) {
            stmt = conn.prepareStatement(INSERIR);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getNome());
            stmt.setString(4, u.getCredencial());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void remover(Usuario u) {
        PreparedStatement stmt;
        try (Connection conn = Conexao.conectar()) {
            stmt = conn.prepareStatement(REMOVER);
            stmt.setInt(1, u.getId());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Usuario u) throws SQLException {

        PreparedStatement stmt;
        try (Connection conn = Conexao.conectar()) {
            stmt = conn.prepareStatement(EDITAR);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getNome());
            stmt.setString(4, u.getCredencial());
            stmt.setInt(4, u.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario buscar(Usuario u) throws SQLException {
        PreparedStatement stmt;

        try (Connection conn = Conexao.conectar()) {
            stmt = conn.prepareStatement(BUSCAR);
            stmt.setString(1, u.getNome());
            ResultSet rs = stmt.executeQuery();

            Usuario usuario = new Usuario();
            if (rs.first()) {
                usuario
                        = new Usuario(rs.getInt("id"),
                                rs.getString("email"),
                                rs.getString("senha"),
                                rs.getString("nome"),
                                rs.getString("credencial"));
            }
            return usuario;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Usuario> listar() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        PreparedStatement stmt;

        try (Connection conn = Conexao.conectar()) {
            stmt = conn.prepareStatement(LISTARTODOS);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario u
                        = new Usuario(rs.getInt("id"),
                                rs.getString("email"),
                                rs.getString("senha"),
                                rs.getString("nome"),
                                rs.getString("credencial"));
                usuarios.add(u);
            }
            return usuarios;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws SQLException {
        /*
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = new Usuario("fulano@gmail.com","123","Fulano");
        udao.inserir(u);
        u = new Usuario("Ciclano@gmail.com","321'","Ciclano");
        udao.inserir(u);
         */

 /*
         UsuarioDAO udao = new UsuarioDAO();
         Usuario u = new Usuario();
         u.setId(1);
         Usuario u2;
         u2 = udao.buscar(u);
         System.out.println(u2.getEmail());
         */
 /*
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = new Usuario(1,"Lindinho","lindinho@bol.com.br","456");
        udao.editar(u);
         */
 /*
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = new Usuario();
        u.setId(1);
        udao.remover(u);
         */
        List<Usuario> usuarios = new UsuarioDAO().listar();

        for (Usuario uu : usuarios) {
            System.out.println(uu.getEmail());
        }
    }

}
