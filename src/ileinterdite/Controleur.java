package ileinterdite;

import java.util.ArrayList;

public class Controleur {
    private Grille grille;
    private ArrayList<Carte_Tresor_Abs_> cartes_trésor_defausse;
    private ArrayList<Aventurier> roles;
    private ArrayList<Tresor> trésors;
    private ArrayList<Joueur> joueurs;
    private ArrayList<Carte_Tresor_Abs_> cartes_trésor_pioche;
    private ArrayList<Carte_Inondation> cartes_innondation_defausse;
    private ArrayList<Carte_Inondation> cartes_innondation_pioche;
    private ArrayList<Carte_Inondation> cartes_innodation_cimetiere;
    
    public Controleur(){
        grille = new Grille();
        roles = new ArrayList<>();
        trésors = new ArrayList<>();
        cartes_innondation_defausse = new ArrayList<>();
        cartes_innondation_pioche = new ArrayList<>();
        cartes_innodation_cimetiere = new ArrayList<>();
        cartes_trésor_defausse = new ArrayList<>();
        cartes_trésor_pioche = new ArrayList<>();
        joueurs = new ArrayList<>();
    }
    public void TourJoueur(Joueur joueur) {

    }

    public void Deplacement(Joueur joueur) {
        String role_joueur_courant;
        Tuile position_joueur_courant;

        //role_joueur_courant = joueur.getRole();
        //position_joueur_courant = joueur.getPosition();

     //   grille.getCasesAdjacentes(position_joueur_courant);
    }


    public void DeplacementExplorateur(Joueur joueur) {

    }

    public void AssecherCase(Joueur joueur) {
        Tuile tuile;
        String role;
        Aventurier aventurier;
        Etat etat_tuile;
        ArrayList<Tuile> tuiles_adjacentes = new ArrayList<>();
        
        aventurier = joueur.getAventurier();
        tuile = aventurier.getPosition();
        System.out.println(tuile.getNumero());
        role = joueur.getAventurier().getRole();
        
        etat_tuile= tuile.getEtat();
        System.out.println(etat_tuile);
        
        if ("explorateur".equals(role)){
            System.out.println("1ere");
            for (Tuile tuile_courante : getGrille().getTuilesAdjacentesDiagonales(tuile)){
                if (tuile_courante.getEtat()== Etat.INONDEE){
                    tuiles_adjacentes.add(tuile_courante);
                }
            }
        }else {
            System.out.println("2eme");
            for (Tuile tuile_courante : getGrille().getTuilesAdjacentes(tuile)){
                System.out.println(tuile_courante.getNom()+" "+tuile_courante.getNumero()+" "+tuile_courante.getEtat()+"beuleubeuleu");
                if(tuile_courante.getEtat()==Etat.INONDEE){
                    tuiles_adjacentes.add(tuile_courante);
                }
            }
        }
        
        for (Tuile tuiles : tuiles_adjacentes){
            System.out.println(tuiles.getNumero()+" "+tuiles.getNom()+" "+tuiles.getEtat()+"beuleu");
        }
    }    

    /**
     * @return the grille
     */
    public Grille getGrille() {
        return grille;
    }
}
