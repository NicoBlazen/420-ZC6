package baenaamayani.Jour1;

import java.util.Scanner;

public class Probleme5 
{

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args) 
    {
        float fMontant = entrerMontant();
        afficherMontant(fMontant);
        lectureClavier.close();
    }
    
    public static float entrerMontant()
    {
        System.out.println("Quelle est le montant? : ");
        float fMontant = lectureClavier.nextInt();
        return fMontant;
    }

    public static float montantRabais(float fMontant)
    {
        fMontant = (fMontant * 0.75f);
        return fMontant;
    }

    public static void afficherMontant(float fMontant)
    {
        System.out.println("Votre montant final est de: " + montantRabais(fMontant));
    }
}