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
        VueAventurier vueAventurier = new VueAventurier ("Manon", "Explorateur",Pion.ROUGE.getCouleur(),controleur );
        Grille grille = new Grille();
        Tuile tuile = new Tuile(26);
        //tests
        System.out.println(grille.getTuile(26).getNom()+" "+grille.getTuile(26).getNumero());
        grille.getTuilesAdjacentesDiagonales(tuile);
    }
    
}
