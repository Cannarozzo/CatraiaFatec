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
public class Embarcacao {
   
    private Integer id;
    private Integer inscricao;
    private String nome;
    private Integer responsavel;

    public Embarcacao(){}
    
    
    public Embarcacao(Integer id, Integer inscricao, String nome, Integer responsavel) {
        this.id = id;
        this.inscricao = inscricao;
        this.nome = nome;
        this.responsavel = responsavel;
    }

    public Integer getInscricao() {
        return inscricao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getProprietario() {
        return responsavel;
    }

    public void setInscricao(Integer inscricao) {
        this.inscricao = inscricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProprietario(Integer proprietario) {
        this.responsavel = responsavel;
    }

    
}
