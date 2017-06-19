/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PC1
 */
public class Usuario {
    private Integer id;
    private String email;
    private String senha;
    private String nome;
    private String credencial; // Pode ser uma ENUM! (DEVE)
    
    public Usuario(){}

    public Usuario(String email, String senha, String nome, String credencial) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.credencial = credencial;
    }

    public Usuario(Integer id, String email, String senha, String nome, String credencial) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.credencial = credencial;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    // Pode Ser 
    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }
    
    
    
}
