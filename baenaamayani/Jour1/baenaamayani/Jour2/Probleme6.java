package baenaamayani.Jour2;

import java.util.Scanner;
import java.util.ArrayList;
 
public class Probleme6 
{
 
    private static Scanner lectureClavier = new Scanner(System.in);
 
    private static ArrayList<Integer> lNombre = new ArrayList<>();
 
    public static void main(String[] args) 
    {
        entrerNb();
        afficherPlusGrand();
        afficherPlusPetit();
        afficherMoyenne();
        lectureClavier.close();
    }
 
    public static void entrerNb()
    {
        int iNb = 0;
        do {
        System.out.print("Entrer un nombre. Le nombre 0 arrêtera votre saisie: ");
        iNb = lectureClavier.nextInt();
        stockerNb(iNb);
        } while (iNb != 0);
    }
 
    public static void stockerNb(int Nombre)
    {
        lNombre.add(Nombre);
    }
 
    public static int trouverPlusGrand()
    {
        int plusGrand = lNombre.get(0);
        for (int i  = 1; i < lNombre.size(); i++) 
        {
            if (plusGrand < lNombre.get(i)) 
            {
                plusGrand = lNombre.get(i);
            }
        }
        return plusGrand;
    }
 
    public static void afficherPlusGrand()
    {
        System.out.println("La plus grande valeur est: " + trouverPlusGrand() );
    }
 
    public static int trouverPlusPetit()
    {
        int plusPetit = lNombre.get(0);
        for (int i  = 1; i < lNombre.size(); i++) 
        {
            if (plusPetit > lNombre.get(i)) 
            {
                plusPetit = lNombre.get(i);
            }
        }
        return plusPetit;
    }
 
    public static void afficherPlusPetit()
    {
        System.out.println("La plus petite valeur est: " + trouverPlusPetit() );
    }
 
    public static int calculerMoyenne()
    {
        int somme = lNombre.get(0);
        for (int i  = 1; i < lNombre.size(); i++) 
        {
            somme = somme + lNombre.get(i);
        }
 
        return somme / lNombre.size();
    }
 
    public static void afficherMoyenne()
    {
        System.out.println("La moyenne des valeurs est: " + calculerMoyenne() );
    }
 
}
