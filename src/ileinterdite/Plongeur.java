package ileinterdite;


import ileinterdite.Aventurier;

public class Plongeur extends Aventurier {
    private String role = "plongeur";

    
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