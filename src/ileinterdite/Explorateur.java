package ileinterdite;


import ileinterdite.Aventurier;
import ileinterdite.Tuile;

public class Explorateur extends Aventurier {
        private String role = "explorateur";

    
    @Override
    public String getRole() {
        return role;
    }

    
    public void setRole(String role) {
        this.role = role;
    }

    public Tuile getPosition() {
         return super.getPosition();
    }

    @Override
    public Joueur getJoueur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}