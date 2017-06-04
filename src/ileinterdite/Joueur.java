package ileinterdite;
import ileinterdite.Aventurier;
import ileinterdite.Tuile;

public class Joueur {
    private Aventurier aventurier;
    private String nom;

    public Joueur(String nom, Aventurier aventurier){
        this.nom=nom;
        this.aventurier=aventurier;
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

    public Tuile getPosition() {
         return aventurier.getPosition();
    }
    
    public void setPostition(Tuile tuile){
        aventurier.setPosition(tuile);
    }
        
        
}