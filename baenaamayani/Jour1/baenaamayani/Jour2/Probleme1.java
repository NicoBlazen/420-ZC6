package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme1
{
    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args)
    {
        String sPhrase = demanderPhrase();

        afficherPhraseConvertie(sPhrase);

        lectureClavier.close();
    }

    public static String demanderPhrase()
    {
        System.out.println("Veuillez entrez une phrase :");

        String sPhrase = lectureClavier.nextLine();

        return sPhrase;
    }

    public static void afficherPhraseConvertie(String sPhrase)
    {
        System.out.println("Voici la phrase en majuscule :");
        System.out.println(sPhrase.toUpperCase());
    }
}