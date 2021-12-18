/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.emsi.tpbanque.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import ma.emsi.tpbanque.session.GestionnaireCompte;
import ma.emsi.tpbanque.CompteBancaire;

/**
 *
 * @author benbrik_mouad
 */
@Named(value = "listeComptes")
@Dependent
public class ListeComptes implements Serializable{
@EJB
    private GestionnaireCompte gestionnaireCompte;
  
  private List<CompteBancaire> listeComptes;
    /**
     * Creates a new instance of ListeComptes
     */
    public ListeComptes() {
    }
    
     public List<CompteBancaire> getAllComptes(){
        if (listeComptes == null)
            listeComptes = gestionnaireCompte.getAllComptes();
        return listeComptes;
    }
    
}
