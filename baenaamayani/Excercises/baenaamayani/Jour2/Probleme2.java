package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme2
{
    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args)
    {
        String sPhrase = demanderPhrase();

        int iNbCaractere = calculerNbCaractere(sPhrase);

        afficherNbCaractere(iNbCaractere);

        lectureClavier.close();
    }

    public static String demanderPhrase()
    {
        System.out.println("Veuillez entrez une phrase :");

        String sPhrase = lectureClavier.nextLine();

        return sPhrase;
    }

    public static int calculerNbCaractere(String sPhrase)
    {
        int iNbCaractere = sPhrase.length();

        return iNbCaractere;
    }

    public static void afficherNbCaractere(int iNbCaractere)
    {
        System.out.println("Votre phrase contient : " + iNbCaractere + " caratères.");
    }
}
