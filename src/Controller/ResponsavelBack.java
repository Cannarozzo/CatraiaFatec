/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Responsavel;
import Model.dao.ResponsavelDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lab4
 */
public class ResponsavelBack {
    private List<Responsavel> responsaveisBack;
    private Responsavel responsavelBack;

    public List<Responsavel> getResponsaveisBack() {
        return responsaveisBack;    }

    public void setResponsaveisBack(List<Responsavel> responsaveisBack) {
        this.responsaveisBack = responsaveisBack;
    }
    public Responsavel getResponsavelBack() {
        return responsavelBack;
    }
    public void setResponsavelBack(Responsavel responsavelBack) {
        this.responsavelBack = responsavelBack;
    }
    
    
    
    
    public void inserirResponsavel(Responsavel r) throws SQLException{
        new ResponsavelDAO().inserir(r);
    }
    public void buscarResponsavel(Responsavel r) throws SQLException{
        new ResponsavelDAO().buscar(r);
    }
    
    public void editarResponsavel(Responsavel r) throws SQLException{
        new ResponsavelDAO().editar(r);
    }
    
    public void removerResponsavel(Responsavel r) throws SQLException{
        new ResponsavelDAO().remover(r);
    }
    
    
    
    
    
}
