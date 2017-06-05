/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import ileinterdite.Utils.Pion;

public class Appli {

    public static void main(String[] args) {
        // TODO code application logic here
        IleInterdite controleur = new IleInterdite() ;
        Controleur test = new Controleur();
        Tuile tuile_pilote;
        Tuile tuile_droite;
        VueAventurier vueAventurier = new VueAventurier ("Manon", "Explorateur",Pion.ROUGE.getCouleur(),controleur );
       
        Aventurier aventurier = new Pilote();
        
        
        aventurier.setPosition(test.getGrille().getTuiles()[14]);
        test.getGrille().setEtat(15, Etat.DISPARUE);
        test.getGrille().setEtat(8, Etat.VIDE);
        test.getGrille().setEtat(13, Etat.INONDEE);
        //test.getGrille().setEtat(20, Etat.INONDEE);
        tuile_pilote=(aventurier.getPosition());
        tuile_droite=test.getGrille().getTuile(tuile_pilote.getNumero()+1);

        for (Tuile tuile : test.getGrille().getTuiles()){
            System.out.println(tuile.getNumero()+" "+tuile.getNom()+" "+tuile.getEtat());
        }
       test.InitJoueur();
       //test.DeplacementPlongeur(joueur);
    }
    
}
