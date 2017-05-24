/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UsuarioC;
import Model.Usuario;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class JF_DASHBOARDFAKE {

    public static void main(String[] args) throws SQLException {
        Scanner s = new Scanner(System.in);
        UsuarioC usuarioController = new UsuarioC();
        int opcao = 0;
        while (true) {
            System.out.println("1 - Inserir Usuário\n"
                    + "2 - Buscar Usuário\n"
                    + "3 - Listar Usuários\n"
            );
            opcao = s.nextInt();
            switch (opcao) {
                case 1 : 
                    System.out.println("Digite o email:");
                    String email = s.next();
                    System.out.println("Digite a  senha: ");
                    String senha = s.next();
                    System.out.println("Digite o nome: ");
                    String nome = s.next();
                    usuarioController.inserirUsuario(new Usuario(email,senha,nome));
                    System.out.println("Usuarário cadastrado");
                    break;
                case 2 :
                    System.out.println("Digite o ID do usuário: ");
                    Integer id = s.nextInt();
                    Usuario uDigitado = new Usuario();
                    uDigitado.setId(id);
                    usuarioController.carregarUsuario(uDigitado); //Carrega o Usuário para um atributo do controller. Pode ser subistutuído pelo retorno do método ao invés de um atributo. Objeto é guardar o estado
                    Usuario u = usuarioController.getUsuarioc();
                    
                    System.out.println("Email do usuário: " + u.getEmail() +
                                       "\nSenha do usuário: " + u.getSenha() +
                                       "\nNome do usuário " + u.getNome());
                    break;
                case 3 :
                    usuarioController.carregarListaUsuarios();
                    for(Usuario uu : usuarioController.getUsuariosc()){
                       
                        System.out.println("Email do usuário: " + uu.getEmail() +
                                       "| Senha do usuário: " + uu.getSenha() +
                                       "| Nome do usuário " + uu.getNome());
                         System.out.println("================================");
                        
                    }
                    System.out.println("Total de Usuários: " + usuarioController.getUsuariosc().size());
                    break;
            }
            System.out.println("");

        }

    }

}
