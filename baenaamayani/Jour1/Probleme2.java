package baenaamayani.Jour1;

import java.util.Scanner;

public class Probleme2
{

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Voici votre salaire bimensuel : " + calculer());

        lectureClavier.close();
    }

    public static float salaireHoraire()
    {
        System.out.println("Quel est votre salaire horaire?");

        float fSalaireHoraire = lectureClavier.nextFloat();

        return fSalaireHoraire;
    }

    public static float nbHeuresSemaine()
    {
        System.out.println("Quel est votre nombre d'heures hebdomadaire?");

        float fNbheuresSemaine = lectureClavier.nextFloat();

        return fNbheuresSemaine;
    }

    public static float calculer()
    {
        return salaireHoraire()*nbHeuresSemaine() * 2;
    }
}
