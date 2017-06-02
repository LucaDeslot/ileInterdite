package ileinterdite;

import java.util.ArrayList;
import ileinterdite.Etat;

public class Tuile {
    private ArrayList<Aventurier> pions;
    private ArrayList<Aventurier> pionsPrésents = new ArrayList<Aventurier>();
    public Carte_Inondation carte;
    private Etat etat;
    private Tresor tresorAssocié;
    private int numero;
    private String nom;
    private final String [] NOM_TUILES ={"La Caverne Des Ombres", "Le Val Du Crépuscule", "La Porte De Cuivre", "Le Marais Brumeux", 
                                   "Le Jardin Des Murmures", "La Caverne du Brasier", "La Porte d'Or","Porte De Fer", "Le Temple Du Soleil", 
                                   "Le Pont Des Abîmes", "La Porte d'Argent", "Le Jardin Des Hurlements", 
                                   "Les Dunes De L'illusion","Les Falaises De l'Oubli","L'Observatoire","Le Palais Des Marais","L'héliport","Le Rocher Fantôme",
                                   "Le Temple De La Lune","La forêt Pourpre","Le Lagon Perdu","La Porte De Bronze","Le Palais De Corail","La Tour De Guet"};
    private final int [] NUM_TUILES_VIDE ={0,1,6,4,5,11,24,29,30,31,34,35};

    public Tuile(int numero){
        setEtat(numero);
        setNumero(numero);   
    }

    public Tuile(){

    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public void setNom(String nom) {
    this.nom = nom;
    }

    public int getNumero() {
    return numero;
    }

    public String getNom() {
        return nom;
    }

    public void MiseAJourDeplacement(Tuile aDepart, Tuile aArrivee, Aventurier aJoueur) {
        //à compléter
    }
/*
    public ArrayList<Aventurier_Abs_> getPionsPrésents(){
        for (Aventurier_Abs_ aventurier : pions){ //pour chaque aventurier
            if (aventurier.getPosition().getNumero()==this.getNumero()){ //on regarde le numério de la tuile sur laquelle il est, et on le compare a la tuile actuelle
                pionsPrésents.add(aventurier); // si le numéro est le même, on ajoute l'aventurier a l'ArrayList pionsPrésents
            }

        }
        return pionsPrésents;
    }
*/        
    public String[] getNOM_TUILES(){
        return NOM_TUILES;
    }    

    public void setEtat(int numero) { // utilisée pour l'initialisation
        int i;
        for ( i=0; i<getNUM_TUILES_VIDE().length && numero != getNUM_TUILES_VIDE()[i];i++ ){}
        if (i!=getNUM_TUILES_VIDE().length ){
            this.etat=Etat.VIDE;
        }else{
            this.etat=Etat.ASSECHEE;
        }   
    }
    
    public void SetEtat(Etat etat){  
        this.etat=etat;
    }

    public int[] getNUM_TUILES_VIDE() {
        return NUM_TUILES_VIDE;
    }

    public Etat getEtat() {
        return etat;
    }


}