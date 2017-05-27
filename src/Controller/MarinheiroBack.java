/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Marinheiro;
import Model.dao.MarinheiroDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lab4
 */
public class MarinheiroBack {
    private List<Marinheiro> marinheirosBack;
    private Marinheiro marinheiroBack;

    public List<Marinheiro> getMarinheirosBack() {
        return marinheirosBack;
    }

    public void setMarinheirosBack(List<Marinheiro> marinheirosBack) {
        this.marinheirosBack = marinheirosBack;
    }

    public Marinheiro getMarinheiroBack() {
        return marinheiroBack;
    }

    public void setMarinheiroBack(Marinheiro marinheiroBack) {
        this.marinheiroBack = marinheiroBack;
    }
    
   public void inserirMarinheiro(Marinheiro m) throws SQLException{
       new MarinheiroDAO().inserir(m);
   }
   
   public Marinheiro buscarMarinheiro(Marinheiro m) throws SQLException{
       return new MarinheiroDAO().buscar(m);
   }
   
   public void editarMarinheiro(Marinheiro m) throws SQLException{
       new MarinheiroDAO().editar(m);
   }
   
   public void removerMarinheiro(Marinheiro m) throws SQLException{
       new MarinheiroDAO().remover(m);
   }
            
   public List<Marinheiro> listarMarinheiros() throws SQLException{
       return new MarinheiroDAO().listar();
   } 
}
