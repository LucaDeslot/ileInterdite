package ileinterdite;

import ileinterdite.Tuile;
import ileinterdite.Aventurier;

public class Pilote extends Aventurier {
    private String role = "pilote";
    
    @Override
    public String getRole() {
        return role;
    }
    
    public Tuile getPosition(){
        return super.getPosition();
    }

    @Override
    public Joueur getJoueur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   



}