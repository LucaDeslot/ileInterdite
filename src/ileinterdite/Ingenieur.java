package ileinterdite;

import ileinterdite.Aventurier;
import ileinterdite.Tuile;

public class Ingenieur extends Aventurier {
    private String role = "ingénieur";

    
    public String getRole() {
        return role;
    }

    
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public Joueur getJoueur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPosition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}