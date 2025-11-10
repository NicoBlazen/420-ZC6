package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme5
{
    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args)
    {
        afficher();

        lectureClavier.close();
    }

    public static void afficher()
    {
        String sAlphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(sAlphabet);

        String sAlphabetEnvers = "";

        for (int i = 25; i >= 0; i--)
        {
            sAlphabetEnvers += sAlphabet.charAt(i);
        }

        System.out.println(sAlphabetEnvers);        
    }
}
