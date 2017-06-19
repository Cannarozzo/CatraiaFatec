/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.autorizacao;

import Model.Usuario;
import javax.swing.JFrame;


/**
 *
 * @author PC1
 */
public class Funcionario1 extends UsuarioAuth{

    public Funcionario1(UsuarioAuth usuarioAuth) {
        super(usuarioAuth);
    }

    @Override
    public JFrame autorizar(Usuario usuario) {
        if(usuario.getCredencial().equals("funcionario1"))
            return new View.usuario.JF_PRINCIPAL_FUNCIONARIO1();
        else
            return this.usuarioAuth.autorizar(usuario);
    }
    
}
