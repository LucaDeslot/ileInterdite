package ileinterdite; 

public class Messager extends Aventurier {
private String role = "messager";

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public Tuile getPosition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Joueur getJoueur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPosition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}