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
import model.autorizacao.Administrador;
import model.autorizacao.Funcionario1;
import model.autorizacao.Funcionario2;
import model.autorizacao.UsuarioAuth;

/**
 *
 * @author PC1
 */
public class UsuarioBack {

    private List<Usuario> usuariosC;
    private Usuario usuarioC;
    private UsuarioAuth autenticacaoAutorizacao;

    public UsuarioBack() {
        // EXEMPLO backbeam
        this.usuariosC = new ArrayList<>();
        this.usuarioC = new Usuario();
        this.autenticacaoAutorizacao = new Funcionario1(new Funcionario2(new Administrador(null)));
    }

    public UsuarioAuth getAutenticacaoAutorizacao() {
        return autenticacaoAutorizacao;
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

    public void inserirUsuario(Usuario u) throws SQLException {
        new UsuarioDAO().inserir(u);
    }

    public void editarUsuario(Usuario u) throws SQLException {
        new UsuarioDAO().editar(u);
    }

    public void buscarUsuario(Usuario u) throws SQLException {
        new UsuarioDAO().buscar(u);
    }

    public void removerUSuario(Usuario u) {
        new UsuarioDAO().remover(u);
    }

    public void carregarListaUsuarios() throws SQLException {
        this.usuariosC = new UsuarioDAO().listar();
    }

    public void carregarUsuario(Usuario u) throws SQLException {
        this.usuarioC = new UsuarioDAO().buscar(u);
    }

    public void editarUsuario(Usuario usuario, String nextLine, String nextLine0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario logarUsuario(Usuario u) {
        return new UsuarioDAO().logar(u);
    }

}
