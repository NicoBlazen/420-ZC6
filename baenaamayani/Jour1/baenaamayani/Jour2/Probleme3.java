package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme3
{
    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args)
    {
        String sPhrase = demanderPhrase();

        int iNbDeA = calculerNbDeA(sPhrase);

        String sNewPhrase = changerApour$(sPhrase);

        afficherResultats(sPhrase, iNbDeA, sNewPhrase);

        lectureClavier.close();
    }

    public static String demanderPhrase()
    {
        System.out.println("Veuillez entrez une phrase :");

        String sPhrase = lectureClavier.nextLine();

        return sPhrase;
    }

    public static int calculerNbDeA(String sPhrase)
    {
        int iNbDeA = 0;

        for (int i = 0; i < sPhrase.length(); i++)
        {
            if (sPhrase.charAt(i) == 'a' || sPhrase.charAt(i) == 'A')
            {
                   iNbDeA++;
            }
        }
        
        return iNbDeA;
    }

    public static String changerApour$(String sPhrase)
    {
        String sNewPhrase = "";

        for (int i = 0; i < sPhrase.length(); i++)
        {
            if (sPhrase.charAt(i) == 'a' || sPhrase.charAt(i) == 'A')
            {
                sNewPhrase += "$";
            }
            else
            {
                sNewPhrase += sPhrase.charAt(i);
            }
        }

        return sNewPhrase;
    }

    public static void afficherResultats(String sPhrase, int iNbDeA, String sNewPhrase)
    {
        System.out.println("Voici la phrase en majuscule : " + sPhrase.toUpperCase());

        System.out.println("Voici le nombre de 'a' : " + iNbDeA);

        System.out.println("Voici la phrase avec les 'a' remplacer par des '$' : " + sNewPhrase);
    }
}