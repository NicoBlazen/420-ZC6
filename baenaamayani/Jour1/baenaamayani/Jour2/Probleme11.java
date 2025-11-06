package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme11 {

    private static Scanner lectureClavier = new Scanner(System.in);

    static int factorielle(int nombre){
        int valeur = 1;
        for(int i = 1; i <= nombre; i++){
            valeur *= i;
        }
        return valeur;
    } 

    public static void main(String[] args) {
        
        int iNombre;
        System.out.print("Entrer un nombre entier >> "); iNombre = lectureClavier.nextInt();
        System.out.println(factorielle(iNombre));
        lectureClavier.close();

    }
}

