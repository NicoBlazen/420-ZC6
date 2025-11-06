package baenaamayani.Jour2;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Probleme6{

    private static Scanner lectureClavier = new Scanner(System.in);
    public static void main(String[] args) {

        int iNb;
        int iMin = 0;
        int iMax = 0;

        float fMoyenne = 0;

        lectureClavier.close();
    }

    public static ArrayList<Integer> demanderLesChiffres(ArrayList<Integer> lValeurs)
    { 
        do
        {
            System.out.println("Veuillez rentre un nombre (si vous inscrivez 0, l'exécution de ce code se terminera.)");
            lValeurs.add(lectureClavier.nextInt());
        }
        while(false);

        
        int nombreSaisi = lectureClavier.nextInt();
        return lValeurs;
    }

    public static int analyserLaSaisie(){
        int Resultat;
    }




}
