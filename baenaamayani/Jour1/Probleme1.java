package baenaamayani.Jour1;

import java.util.Scanner;

public class Probleme1
{
    private static Scanner lectureClavier = new Scanner(System.in);
    public static void main(String[] args)
    {
        String sTexte=Afficher();
 
        System.out.println(sTexte);

        lectureClavier.close();
    }
 
    public static String Afficher()
    {
        boolean bNombre1IsBigger=Nombre1IsBigger();
 
        String sTexteAAfficher ="";
 
        if (bNombre1IsBigger)
        {
            sTexteAAfficher="Le premier nombre est plus grand";
        }
        else
        {
            sTexteAAfficher="Le deuxième nombre est plus grand";
        }
 
        return sTexteAAfficher;
    }
 
    public static boolean Nombre1IsBigger()
    {
        int inb1=inb1();
        int inb2=inb2();
        boolean bNombre1IsBigger = false;
 
        if (inb1>inb2)
        {
            bNombre1IsBigger= true;
        }
        else
        {
            bNombre1IsBigger= false;
        }
 
        return bNombre1IsBigger;
    }
 
    public static int inb1()
    {
        System.out.println("Entrez le premier nombre:");
        int inb1 =  lectureClavier.nextInt();
 
        return inb1;
    }
 
    public static int inb2()
    {
        System.out.println("Entrez le deuxième nombre:");
        int inb2 =  lectureClavier.nextInt();
 
        return inb2;
    }
}