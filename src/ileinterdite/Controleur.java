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

    public void Deplacement(Joueur joueur) { // à appeler aussi pour explorateur
        ArrayList<Tuile> tuiles_deplacement = getGrille().getTuilesDeplacement(joueur);
        boolean controle_boucle =true;
        
        System.out.println("Voici les cases sur lesquelles vous pouvez vous déplacer:");
        for(Tuile tuile_deplacement : tuiles_deplacement){
            System.out.println(tuile_deplacement.getNumero()+" "+tuile_deplacement.getNom()+" "+tuile_deplacement.getEtat());
        }
        
        while (controle_boucle){
            
            System.out.println("Rentrez le numéro de la tuile sur laquelle vous voulez vous déplacer :");
            int tuile_choisie = scanner.nextInt(); //l'utilisateur saise le numéro de la tuile

            for (int i =0;i<tuiles_deplacement.size();i++){
                if (tuile_choisie==tuiles_deplacement.get(i).getNumero()){
                    joueur.setPostition(getGrille().getTuile(tuile_choisie)); // on modifie la position du joueur
                    controle_boucle = false;
                    System.out.println("Vous vous êtes bien déplacé sur la tuile :"+tuile_choisie+" "+grille.getTuile(tuile_choisie).getNom()+" "+grille.getTuile(tuile_choisie).getEtat());    
                }else if(i==tuiles_deplacement.size()-1 && tuile_choisie != tuiles_deplacement.get(i).getNumero() && controle_boucle){
                    System.out.println("Vous ne pouvez pas vous déplacer sur cette tuile, veuillez rentrer un nouveau numero :");    
                }
            } //fin for
        } //fin while
        //partie test
        System.out.println(joueur.getPosition().getNumero());
    }
    
    public void DeplacementPlongeur(Joueur joueur){
        
        boolean controle_boucle = true;
        
        System.out.println("Voici les cases sur lesquelles vous pouvez vous déplacer:");
        for(Tuile tuile_deplacement : getGrille().getTuilesDeplacementPlongeur(joueur)){
            System.out.println(tuile_deplacement.getNumero()+" "+tuile_deplacement.getNom()+" "+tuile_deplacement.getEtat());
        }
        
        while(controle_boucle){
            System.out.println("Rentrez le numéro de la tuile sur laquelle vous voulez vous déplacer :");
            int tuile_choisie = scanner.nextInt(); //l'utilisateur saise le numéro de la tuile
            
            while (getGrille().getTuile(tuile_choisie).getEtat() == Etat.INONDEE || getGrille().getTuile(tuile_choisie).getEtat() == Etat.DISPARUE){
                for (int i =0;i<getGrille().getTuilesDeplacementPlongeur(joueur).size();i++){
                    if (tuile_choisie==getGrille().getTuilesDeplacementPlongeur(joueur).get(i).getNumero()){
                         joueur.setPostition(getGrille().getTuile(tuile_choisie)); //on modifie la position du joueur
                    }
                 }
                System.out.println("Voici les cases sur lesquelles vous pouvez vous déplacer :");
                for(Tuile tuile_deplacement : getGrille().getTuilesDeplacementPlongeur(joueur)){
                    System.out.println(tuile_deplacement.getNumero()+" "+tuile_deplacement.getNom()+" "+tuile_deplacement.getEtat());
                }
                System.out.println("Rentrez le numéro de la tuile sur laquelle vous voulez vous déplacer :");
                tuile_choisie = scanner.nextInt();
            }
            
            if (getGrille().getTuile(tuile_choisie).getEtat()==Etat.ASSECHEE){
                for (int i =0;i<getGrille().getTuilesDeplacementPlongeur(joueur).size();i++){
                    if (tuile_choisie==getGrille().getTuilesDeplacementPlongeur(joueur).get(i).getNumero()){
                         joueur.setPostition(getGrille().getTuile(tuile_choisie)); //on modifie la position du joueur
                    }
                }//fin for
            controle_boucle=false;
                System.out.println("Vous vous êtes bien déplacé sur la tuile :"+getGrille().getTuile(tuile_choisie).getNumero()+" "+getGrille().getTuile(tuile_choisie).getNom()+" "+getGrille().getTuile(tuile_choisie).getEtat());
            }//fin if
        }//fin while     
    }
    
    public void DeplacementPilote(Joueur joueur){
        
    }
    
    public void DeplacementNavigateur(Joueur joueur){
        
    }

    public void AssecherCase(Joueur joueur) {
        Aventurier aventurier = joueur.getAventurier();
        Tuile tuile_aventurier = aventurier.getPosition();
        Etat etat_tuile= tuile_aventurier.getEtat();
        ArrayList<Tuile> tuiles_assechables = getGrille().getTuilesAssechables(joueur);
        
        boolean controle_boucle = true;
        
        System.out.println("Voici les tuiles que vous pouvez assécher :");
        for (Tuile tuiles : tuiles_assechables){       
            System.out.println(tuiles.getNumero()+" "+tuiles.getNom()+" "+tuiles.getEtat());    
        }
        while (controle_boucle){
            
            System.out.println("rentrez le numero de la tuile que vous voulez assécher");
            int tuile_choisie = scanner.nextInt();
            

            for (int i =0;i<tuiles_assechables.size();i++){
                if (tuile_choisie==tuiles_assechables.get(i).getNumero()){
                    grille.setEtat(tuile_choisie, Etat.ASSECHEE);
                    controle_boucle = false;
                    System.out.println("la case numero :"+tuile_choisie+ " a bien été asséechée"+" "+grille.getTuile(tuile_choisie).getEtat());    
                }else if(i==tuiles_assechables.size()-1 && tuile_choisie != tuiles_assechables.get(i).getNumero() && controle_boucle){
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
                        System.out.println(tuile.getNumero()+" "+tuile.getNom()+" "+tuile.getEtat());
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
