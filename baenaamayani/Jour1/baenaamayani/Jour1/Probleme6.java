package baenaamayani.Jour1;

import java.util.Scanner;
 
public class Probleme6 
{
 
    private static Scanner lectureClavier = new Scanner(System.in);
 
    public static void main(String[] args) 
    {
        String sNom = entrerNom();
        Integer choixBois = entrerChoix();
        String sNomBois = choisirBois(choixBois);
        int iPrix = choisirPrix(sNomBois);
        float fLongeur = entrerLongeur();
        float fLargeur = entrerLargeur();
 
        float fAire = calculerAire(fLongeur, fLargeur);
        float fPrixTotal = calculerPrix(iPrix, fAire);

        lectureClavier.close();
    }
    public static String entrerNom()
    {
        System.out.println("Quelle est votre nom? :");
        String sNom = lectureClavier.nextLine();
        return sNom;
    }
 
    public static int entrerChoix()
    {
        System.out.println("Quelle type de plancher voulez-vous?");
        System.out.println("1. Chêne | 2. Érable | 3. Pin : ");
        int iChoix = lectureClavier.nextInt();
        return iChoix;
    }
    public static float entrerLongeur()
    {
        System.out.println("Quelle est la longeur de votre plancher? :");
        float fLongeur = lectureClavier.nextFloat();
        return fLongeur;
    }
    public static float entrerLargeur()
    {
        System.out.println("Quelle est la largeur de votre plancher? :");
        float fLargeur = lectureClavier.nextFloat();
        return fLargeur;
    }
    public static String choisirBois(int choix) 
    {
 
        String typeBois = "";
 
        if (choix == 1) {
            typeBois = "Chêne";
            choisirPrix(typeBois);
        }else if (choix == 2) {
            typeBois = "Érable";
            choisirPrix(typeBois);
        }else if (choix == 3) {
            typeBois = "Pin";
            choisirPrix(typeBois);
        }
        return typeBois;
    }
 
    public static int choisirPrix(String choixBois)
    {
        Integer iPrix = 0;
 
        if (choixBois == "Chêne") 
            {
                iPrix = 5;
            } else if (choixBois == "Érable") 
            {
                iPrix = 12;
            } else if (choixBois == "Pin") 
            {
                iPrix = 10;
            } else {
                System.out.println("Vous n'avez pas choisit le bon type de plancher");
                System.exit(0);
            }
        return iPrix;
    }
 
    public static float calculerAire(float longeur, float largeur)
    {
        float fAire = longeur * largeur;
        afficherAire(fAire);
        return fAire;
    }
 
    public static void afficherAire(float aire)
    {
        System.out.println("Votre plancher est de: " + aire);
    }
 
    public static float calculerPrix(int prix, float aire)
    {
        float fPrix = prix * aire;
        afficherPrix(fPrix);
        return fPrix;
    }
 
    public static void afficherPrix(float prix)
    {
        System.out.println("Votre plancher coute: " + prix) ;
    }
 
    
 
 
    
}
