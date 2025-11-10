package baenaamayani.Jour1;

import java.util.Scanner;

public class Probleme6 {

    private static Scanner lectureClavier = new Scanner(System.in);

    private static String sNom;
    private static float fPrixTotal;

    public static void main(String[] args) {
        sNom = entrerNom();

        int choixBois = entrerChoix();
        String sNomBois = choisirBois(choixBois);

        int iPrix = choisirPrix(sNomBois);


        float fLongeur = entrerLongeur();
        float fLargeur = entrerLargeur();

        float fAire = calculerAire(fLongeur, fLargeur);

        fPrixTotal = calculerPrix(iPrix, fAire);

        afficherResume();

        lectureClavier.close();
    }

    public static String entrerNom() {
        System.out.print("Quel est votre nom ? : ");
        return lectureClavier.nextLine();
    }

    public static int entrerChoix() {
        System.out.println("Quel type de plancher voulez-vous ?");
        System.out.println("1. Chêne | 2. Érable | 3. Pin : ");
        return lectureClavier.nextInt();
    }

    public static float entrerLongeur() {
        System.out.print("Quelle est la longueur de votre plancher (m) ? : ");
        return lectureClavier.nextFloat();
    }

    public static float entrerLargeur() {
        System.out.print("Quelle est la largeur de votre plancher (m) ? : ");
        return lectureClavier.nextFloat();
    }

    public static String choisirBois(int choix) {
        switch (choix) {
            case 1:
                return "Chêne";
            case 2:
                return "Érable";
            case 3:
                return "Pin";
            default:
                System.out.println("Choix invalide !");
                System.exit(0);
                return ""; 
        }
    }

    public static int choisirPrix(String choixBois) {
        if (choixBois.equals("Chêne")) {
            return 5;
        } else if (choixBois.equals("Érable")) {
            return 12;
        } else if (choixBois.equals("Pin")) {
            return 10;
        } else {
            System.out.println("Type de bois invalide !");
            System.exit(0);
            return 0;
        }
    }

    public static float calculerAire(float longeur, float largeur) {
        float aire = longeur * largeur;
        System.out.println("Votre plancher a une aire de : " + aire + " m²");
        return aire;
    }

    public static float calculerPrix(int prixParMetreCarre, float aire) {
        float prixTotal = prixParMetreCarre * aire;
        System.out.println("Prix total pour le bois choisi : " + prixTotal + " €");
        return prixTotal;
    }

    public static void afficherResume() {
        System.out.println("\nRésumé de la commande pour " + sNom + " :");
        System.out.println("Prix total : " + fPrixTotal + " €");
    }
}
