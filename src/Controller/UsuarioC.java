/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import Model.dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC1
 */
public class UsuarioC {
    private List<Usuario> usuariosc;
    private Usuario usuarioc;
    
    
    public UsuarioC(){
        // EXEMPLO
        this.usuariosc = new ArrayList<>();
        this.usuarioc = new Usuario();
    }

    public List<Usuario> getUsuariosc() {
        return usuariosc;
    }

    public void setUsuariosc(List<Usuario> usuariosc) {
        this.usuariosc = usuariosc;
    }

    public Usuario getUsuarioc() {
        return usuarioc;
    }
    public void setUsuarioc(Usuario usuarioc) {
        this.usuarioc = usuarioc;
    }
    
    
    
    public void inserirUsuario(Usuario u) throws SQLException{
        new UsuarioDAO().inserir(u);
    }
    public void carregarListaUsuarios() throws SQLException{
        this.usuariosc = new UsuarioDAO().listar();
    }    
    public void carregarUsuario(Usuario u) throws SQLException{
        this.usuarioc = new UsuarioDAO().buscar(u);
    }
    
}
