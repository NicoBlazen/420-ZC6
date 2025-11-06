package baenaamayani.Jour2;

import java.util.Scanner;



public class Probleme9 {

    private static Scanner lectureClavier = new Scanner(System.in);


    static double circonference(double rayon){
        return 2 * Math.PI * rayon;
    }
    public static void main(String[] args) {

        System.out.print("Insérer le rayon d'un cercle :");
        System.out.printf("Rayon: %f", circonference(lectureClavier.nextDouble()));

        lectureClavier.close();
    }
}
