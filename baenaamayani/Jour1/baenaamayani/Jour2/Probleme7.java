package baenaamayani.Jour2;
 
import java.util.Scanner;
 
public class Probleme7 
{
    private static Scanner lectureClavier = new Scanner(System.in);
    public static void main(String[] args)
    {
        String sPhrase = entrerPhrase();
        calculerNbVoyelle(sPhrase);
        calculerNbConsonne(sPhrase);
 
        lectureClavier.close();
    }
 
    public static String entrerPhrase()
    {
        System.out.print("Entrer une phrase: ");
        String sPhrase = lectureClavier.nextLine();
        sPhrase = sPhrase.toLowerCase();
 
        return sPhrase;
    }
 
    public static void calculerNbVoyelle(String sPhrase)
    {
        int iNbVoyelle = 0;
 
        for (int i = 0; i < sPhrase.length(); i++)
        {
            char ch = sPhrase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                iNbVoyelle++;    
            }
        }
        afficherNbVoyelle(iNbVoyelle);
    }
 
    public static void calculerNbConsonne(String sPhrase)
    {
        int iNbConsonne = 0;
        for (int i = 0; i < sPhrase.length(); i++)
        {
            char ch = sPhrase.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') 
            {
                iNbConsonne++;   
            }
        }
        afficherNbConsonne(iNbConsonne);
    }
 
    public static void afficherNbVoyelle(int Voyelle)
    {
        System.out.println("Cette phrase contient " + Voyelle + " voyelles");
    }
 
 
    public static void afficherNbConsonne(int Consonne)
    {
        System.out.println("Cette phrase contient " + Consonne + " consonnes");
    }
}
