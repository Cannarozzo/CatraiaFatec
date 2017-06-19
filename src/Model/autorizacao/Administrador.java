/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.autorizacao;

import Model.Usuario;
import View.JF_LOGIN;
import javax.swing.JFrame;

/**
 *
 * @author PC1
 */
public class Administrador extends UsuarioAuth {

    public Administrador(UsuarioAuth usuarioAuth) {
        super(usuarioAuth);
    }

    @Override
    public JFrame autorizar(Usuario usuario) {
        if(usuario.getCredencial().equals("administrador"))
            return new view.usuario.JF_PRINCIPAL_ADMINISTRADOR();
        else
            return new JF_LOGIN();
    }

  
    
}
