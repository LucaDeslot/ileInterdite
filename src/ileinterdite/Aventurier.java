package ileinterdite;

import java.util.ArrayList;

public abstract class Aventurier {
    public ArrayList<Carte_Tresor_Abs_> main = new ArrayList<Carte_Tresor_Abs_>();
    private Joueur joueur_associé;
    private Tuile position_actuelle;
    
    
    public abstract String getRole();


    public Joueur getJoueur(){
        return joueur_associé;
    }

    public void setPosition(Tuile position_actuelle) {
        this.position_actuelle = position_actuelle;
    }    
}