package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme4
{
    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args)
    {
        demanderValeur();

        lectureClavier.close();
    }

    public static int demanderValeur()
    {
        int iValeur =  0;

        do
        {
           System.out.println("Veuillez entrer un nombre entre 0 et 100");

           iValeur = lectureClavier.nextInt();

        }
        while(iValeur > 100 || iValeur < 0);
        
        return iValeur;
    }
}
