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
    private Integer responsavelId;

    public Embarcacao() {
    }
    
    
    // staticbinding para inserção de um novo objeto
    public Embarcacao(Integer inscricao, String nome, Integer responsavelId) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.responsavelId = responsavelId;
    }

    
    //Staticbiding para criação de um objeto vindo do banco de dados
    public Embarcacao(Integer id, Integer inscricao, String nome, Integer responsavelId) {
        this.id = id;
        this.inscricao = inscricao;
        this.nome = nome;
        this.responsavelId = responsavelId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInscricao() {
        return inscricao;
    }

    public void setInscricao(Integer inscricao) {
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getResponsavelId() {
        return responsavelId;
    }

    public void setResponsavel(Integer responsavel) {
        this.responsavelId = responsavel;
    }
}
