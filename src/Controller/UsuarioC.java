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
    private List<Usuario> usuariosC;
    private Usuario usuarioC;
    
    
    public UsuarioC(){
        // EXEMPLO
        this.usuariosC = new ArrayList<>();
        this.usuarioC = new Usuario();
    }

    public List<Usuario> getUsuariosC() {
        return usuariosC;
    }

    public void setUsuariosC(List<Usuario> usuariosC) {
        this.usuariosC = usuariosC;
    }

    public Usuario getUsuarioC() {
        return usuarioC;
    }

    public void setUsuarioC(Usuario usuarioC) {
        this.usuarioC = usuarioC;
    }

  
    
    
    
    public void inserirUsuario(Usuario u) throws SQLException{
        new UsuarioDAO().inserir(u);
    }
   
    public void carregarListaUsuarios() throws SQLException{
        this.usuariosC = new UsuarioDAO().listar();
    }    
    public void carregarUsuario(Usuario u) throws SQLException{
        this.usuarioC = new UsuarioDAO().buscar(u);
    }
    
}
