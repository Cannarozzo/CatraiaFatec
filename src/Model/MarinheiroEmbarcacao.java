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
public class MarinheiroEmbarcacao {
    Integer id;
    Embarcacao embarcacao;
    Marinheiro marinheiro;

    public MarinheiroEmbarcacao(Integer id, Embarcacao embarcacao, Marinheiro marinheiro) {
        this.id = id;
        this.embarcacao = embarcacao;
        this.marinheiro = marinheiro;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }

    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }

    public Marinheiro getMarinheiro() {
        return marinheiro;
    }

    public void setMarinheiro(Marinheiro marinheiro) {
        this.marinheiro = marinheiro;
    }
        
    
}
