/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;


/**
 *
 * @author Matheus
 */
public class Teste {

    Map<String, String> associados = new HashMap<String, String>();
    ArrayList<String> marinheiros = new ArrayList<>();
    ArrayList<String> embarcacoes = new ArrayList<>();

    public Map<String, String> getAssociados() {
        return associados;
    }
    public void setAssociados(Map<String, String> associados) {
        this.associados = associados;
    }

    public ArrayList<String> getMarinheiros() {
        return marinheiros;
    }

    public void setMarinheiros(ArrayList<String> marinheiros) {
        this.marinheiros = marinheiros;
    }

    public ArrayList<String> getEmbarcacoes() {
        return embarcacoes;
    }

    public void setEmbarcacoes(ArrayList<String> embarcacoes) {
        this.embarcacoes = embarcacoes;
    }


  
    public static void main(String... args) {
        
      
        
        

    }
}
