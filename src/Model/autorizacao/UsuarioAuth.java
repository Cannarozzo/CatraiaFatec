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
public abstract class UsuarioAuth {

    protected UsuarioAuth usuarioAuth;
    

    public UsuarioAuth(UsuarioAuth usuarioAuth){
        this.usuarioAuth = usuarioAuth;
    }
    
    public abstract JFrame autorizar(Usuario usuario);

}
