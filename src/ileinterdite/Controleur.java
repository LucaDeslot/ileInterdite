package ileinterdite;

import com.sun.glass.ui.SystemClipboard;
import java.util.ArrayList;
import java.util.Scanner;

public class Controleur {
    private Grille grille;
    private Scanner scanner;
    private ArrayList<Carte_Tresor_Abs_> cartes_trésor_defausse;
    private ArrayList<Aventurier> roles;
    private ArrayList<Tresor> trésors;
    private ArrayList<Joueur> joueurs;
    private ArrayList<Carte_Tresor_Abs_> cartes_trésor_pioche;
    private ArrayList<Carte_Inondation> cartes_innondation_defausse;
    private ArrayList<Carte_Inondation> cartes_innondation_pioche;
    private ArrayList<Carte_Inondation> cartes_innodation_cimetiere;
    
    public Controleur(){
        scanner = new Scanner(System.in);
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
        Aventurier aventurier = joueur.getAventurier();
        Tuile tuile_aventurier = aventurier.getPosition();
        Etat etat_tuile= tuile_aventurier.getEtat();
        ArrayList<Tuile> tuiles_assechables = getGrille().getTuilesAssechables(joueur);
        int case_choisie;
        boolean controle_boucle = true;
        
        System.out.println("Voici les tuiles que vous pouvez assécher :");
        for (Tuile tuiles : tuiles_assechables){       
            System.out.println(tuiles.getNumero()+" "+tuiles.getNom()+" "+tuiles.getEtat());    
        }
        while (controle_boucle){
            
            System.out.println("rentrez le numero de la tuile que vous voulez assécher");
            int str = scanner.nextInt();
            case_choisie = str;

            for (int i =0;i<tuiles_assechables.size();i++){
                if (case_choisie==tuiles_assechables.get(i).getNumero()){
                    grille.setEtat(case_choisie, Etat.ASSECHEE);
                    controle_boucle = false;
                    System.out.println("la case numero :"+case_choisie+ " a bien été asséechée"+" "+grille.getTuile(case_choisie).getEtat());    
                }else if(i==tuiles_assechables.size()-1 && case_choisie != tuiles_assechables.get(i).getNumero() && controle_boucle){
                    System.out.println("Vous ne pouvez pas assécher cette tuile, veuillez rentrer un nouveau numero :");    
                }
            } //fin for
        } //fin while
    }
    
    public void AssecherCaseIngenieur(Joueur joueur){
        //controle boucle ==0 -> 1ere tuile à assécher
        //controle boucle ==1 -> 2eme tuile à assécher
        //controle boucle ==2 -> sortie de boucle
        Aventurier aventurier = joueur.getAventurier();
        Tuile tuile_aventurier = aventurier.getPosition();
        Etat etat_tuile= tuile_aventurier.getEtat();
        ArrayList<Tuile> tuiles_assechables1 = getGrille().getTuilesAssechables(joueur);
        ArrayList<Tuile> tuiles_assechables2;
        int case_choisie;
        boolean deuxieme_assechage=false;
        boolean premier_assechage =true;
        
        System.out.println("Voici les tuiles que vous pouvez assécher :");
        for (Tuile tuiles : tuiles_assechables1){       
            System.out.println(tuiles.getNumero()+" "+tuiles.getNom()+" "+tuiles.getEtat());    
        }
        while (premier_assechage){
                System.out.println("rentrez le numero de la tuile que vous voulez assécher");
                int str = scanner.nextInt();
                case_choisie = str;

                for (int i =0;i<tuiles_assechables1.size();i++){
                    if (case_choisie==tuiles_assechables1.get(i).getNumero()){
                        grille.setEtat(case_choisie, Etat.ASSECHEE);
                        premier_assechage=false;  
                        System.out.println("la case numero :"+case_choisie+ " a bien été asséechée"+" "+grille.getTuile(case_choisie).getEtat());    

                    }else if(i==tuiles_assechables1.size()-1 && case_choisie != tuiles_assechables1.get(i).getNumero() && premier_assechage==true){
                        System.out.println("Vous ne pouvez pas assécher cette tuile, veuillez rentrer un nouveau numero :");    
                    }
                }//fin for    
        }
        System.out.println("Voulez-vous assécher une nouvelle tuile ? true/false");
        boolean bool = scanner.nextBoolean();
        deuxieme_assechage = bool;
        if (deuxieme_assechage){
            tuiles_assechables2=getGrille().getTuilesAssechables(joueur);
            for (Tuile tuile : tuiles_assechables2){
                        System.out.println(tuile.getNumero()+" "+tuile.getNumero());
            }
        }
        while(deuxieme_assechage){
            System.out.println("rentrez le numero de la tuile que vous voulez assécher");
            int str = scanner.nextInt();
            case_choisie = str;

            for (int i =0;i<tuiles_assechables1.size();i++){
                if (case_choisie==tuiles_assechables1.get(i).getNumero()){
                    grille.setEtat(case_choisie, Etat.ASSECHEE);
                    deuxieme_assechage=false;  
                    System.out.println("la case numero :"+case_choisie+ " a bien été asséechée"+" "+grille.getTuile(case_choisie).getEtat());    

                }else if(i==tuiles_assechables1.size()-1 && case_choisie != tuiles_assechables1.get(i).getNumero() && deuxieme_assechage==true){
                    System.out.println("Vous ne pouvez pas assécher cette tuile, veuillez rentrer un nouveau numero :");    
                }
            }//fin for    
        }
    }


    public Grille getGrille() {
        return grille;
    }
}
