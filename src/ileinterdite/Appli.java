/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import ileinterdite.Utils.Pion;

/**
 *
 * @author carriefa
 */
public class Appli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IleInterdite controleur = new IleInterdite() ;
        Controleur test = new Controleur();
        Tuile tuile_pilote;
        Tuile tuile_droite;
        VueAventurier vueAventurier = new VueAventurier ("Manon", "Explorateur",Pion.ROUGE.getCouleur(),controleur );
       
    
      
       
        Aventurier aventurier = new Pilote();
        Joueur joueur = new Joueur("jean",aventurier);
        
        aventurier.setPosition(test.getGrille().getTuiles()[14]);
        test.getGrille().setEtat(14, Etat.INONDEE);
        test.getGrille().setEtat(9, Etat.INONDEE);
        tuile_pilote=(aventurier.getPosition());
        tuile_droite=test.getGrille().getTuile(tuile_pilote.getNumero()+1);

        
        test.getGrille().setEtat(tuile_droite.getNumero(),Etat.INONDEE);

        
        for (Tuile tuile : test.getGrille().getTuiles()){
            System.out.println(tuile.getNumero()+" "+tuile.getNom()+" "+tuile.getEtat());
        }

       test.AssecherCaseIngenieur(joueur);
    }
    
}
