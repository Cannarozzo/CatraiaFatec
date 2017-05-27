/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Embarcacao;
import Model.dao.EmbarcacaoDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lab4
 */
public class EmbarcacaoBack {

    List<Embarcacao> embarcacoes;
    Embarcacao embarcacao;

    public List<Embarcacao> getEmbarcacoes() {
        return embarcacoes;
    }

    public void setEmbarcacoes(List<Embarcacao> embarcacoes) {
        this.embarcacoes = embarcacoes;
    }

    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }

    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }

    public void inserirEmbarcacao(Embarcacao e) throws SQLException {
        new EmbarcacaoDAO().inserir(e);
    }

    public void buscarEmbarcacao(Embarcacao e) throws SQLException {
        new EmbarcacaoDAO().buscar(e);
    }

    public void editarEmbarcacao(Embarcacao e) throws SQLException {
        new EmbarcacaoDAO().editar(e);
    }

    public void remover(Embarcacao e) throws SQLException {
        new EmbarcacaoDAO().remover(e);
    }

}
