package baenaamayani.TP1;

import java.util.Scanner;

public class TP1 {
    private static Scanner lectureClavier = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("TRAVAIL PRATIQUE #1 - Nicholas");
        System.out.println("-------------------------------");

        double dMonnaie[] = {100, 50, 20, 10, 5, 2, 1, 0.25, 0.10, 0.05, 0.01};

        afficherTableau();
        
        lectureClavier.close();

    }

    public static void afficherTableau(){

        String sTableau[] = new String[3];

        sTableau[0] = "1) Transformer $$$ en monnaie";
        sTableau[1] = "2) Jeu trouver un nombre mystère";
        sTableau[2] = "3) Quitter";

        System.out.println(sTableau[0]);
        System.out.println(sTableau[1]);
        System.out.println(sTableau[2]);
    } 


    
}
