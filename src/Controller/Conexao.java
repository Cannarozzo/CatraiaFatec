/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static String USER = "root";
    private static String PASS = "root";
    private static String URL = "jdbc:mysql://localhost/catraia";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);

    }
   
    public static void main(String [] args) throws SQLException{
        Connection c = Conexao.conectar();
        
        
        System.out.println("Conexão.class");
    }
    
}
