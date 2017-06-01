package ileinterdite;
import ileinterdite.Aventurier;
import ileinterdite.Tuile;

public class Joueur {
    private Aventurier aventurier;
    private String nom;

    public Joueur(String nom){
        this.nom=nom;
    }


    public Aventurier getAventurier() {
            return this.aventurier;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    Tuile getPosition() {
         //To change body of generated methods, choose Tools | Templates.
    }
        
        
}