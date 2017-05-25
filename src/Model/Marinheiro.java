/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Matheus
 */
public class Marinheiro {

    private Integer id;
    private String nome;
    private String habilitacao;
    
    public Marinheiro(){}
    public Marinheiro(Integer id, String nome, String habilitacao) {
        this.id = id;
        this.nome = nome;
        this.habilitacao = habilitacao;
    }

    public Marinheiro(String nome, String habilitacao) {
        this.nome = nome;
        this.habilitacao = habilitacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }


}
