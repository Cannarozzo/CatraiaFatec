/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UsuarioBack;
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
        UsuarioBack usuarioController = new UsuarioBack();
        int opcao = 0;
        while (true) {
            System.out.println("1 - Inserir Usuário\n"
                    + "2 - Buscar Usuário\n"
                    + "3 - Listar Usuários\n"
                    + "4 - Editar Usuário\n"
                    + "5 - Remover Usuário"
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
                    System.out.println("Digite uma credencial:");
                    String credencial = s.next();
                    usuarioController.inserirUsuario(new Usuario(email,senha,nome,credencial));
                    System.out.println("Usuarário cadastrado");
                    break;
                case 2 :
                    System.out.println("Digite o Nome do usuário: ");
                    String nomeB = s.next();
                    Usuario uDigitado = new Usuario();
                    uDigitado.setNome(nomeB);
                    usuarioController.carregarUsuario(uDigitado); //Carrega o Usuário para um atributo do controller. Pode ser subistutuído pelo retorno do método ao invés de um atributo. Objeto é guardar o estado
                    Usuario u = usuarioController.getUsuarioC();
                    
                    System.out.println("Email do usuário: " + u.getEmail() +
                                       "\nSenha do usuário: " + u.getSenha() +
                                       "\nNome do usuário " + u.getNome());
                    break;
                case 3 :
                    usuarioController.carregarListaUsuarios();
                    for(Usuario uu : usuarioController.getUsuariosC()){
                       
                        System.out.println("Email do usuário: " + uu.getEmail() +
                                       "| Senha do usuário: " + uu.getSenha() +
                                       "| Nome do usuário " + uu.getNome());
                         System.out.println("================================");
                        
                    }
                    System.out.println("Total de Usuários: " + usuarioController.getUsuariosC().size());
                    break;
                case 4: 
                    System.out.println("Digite os valores na sequencia: id email senha nome");
                    Usuario usuarioEditar = new Usuario(s.nextInt(),s.next(),s.next(),s.next(),s.next());
                    usuarioController.editarUsuario(usuarioEditar);                    
                    break;
                case 5: 
                    System.out.println("Digite o ID do usuário para remové-lo: ");
                    Usuario usuarioRemover = new Usuario();
                    usuarioRemover.setId(s.nextInt());
                    usuarioController.removerUSuario(usuarioRemover);                    
                    break;
            }
            System.out.println("");

        }

    }

}
