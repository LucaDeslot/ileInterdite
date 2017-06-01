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
       
        for (Tuile tuile : test.getGrille().getTuiles()){
            System.out.println(tuile.getNumero()+" "+tuile.getNom());
        }
      
       
        Aventurier pilote = new Pilote();
        Joueur joueur = new Joueur("jean",pilote);
        
        pilote.setPosition(test.getGrille().getTuiles()[14]);
        test.getGrille().setEtat(14, Etat.INONDEE);
        System.out.println(test.getGrille().getTuile(14).getEtat()+"bebebeub");
        tuile_pilote=(pilote.getPosition());
        System.out.println(tuile_pilote.getNom());
        
        tuile_droite=test.getGrille().getTuile(tuile_pilote.getNumero()+1);
        System.out.println(tuile_droite.getNumero());
        
        test.getGrille().setEtat(tuile_droite.getNumero(),Etat.INONDEE);
        System.out.println(tuile_droite.getEtat());
        System.out.println(pilote.getRole());
        
        for (Tuile tuile : test.getGrille().getTuiles()){
            System.out.println(tuile.getNumero()+" "+tuile.getNom()+" "+tuile.getEtat());
        }
  //      System.out.println(pilote.getPosition().getNumero());
  //      System.out.println(pilote.getPosition().getNom());
        
        //System.out.println(aventurier.getRole());
        //tests
        //System.out.println(grille.getTuile(26).getNom()+" "+grille.getTuile(26).getNumero());
        //grille.getTuilesAdjacentesDiagonales(tuile);
       test.AssecherCase(joueur);
    }
    
}
