package baenaamayani.Jour3;

import java.util.Scanner;

public class Probleme2 {

    private static Scanner lectureClavier = new Scanner(System.in);
    public static void main(String[] args) {
        
        double[] monTableau = creerTableau();
        afficherTableau(monTableau);

        lectureClavier.close();
    }
    
    public static double[] creerTableau(){
        double[] dTableau = new double[10];

        for (int i = 0; i < dTableau.length; i++) {
            System.out.print("Entrez un nombre réel pour la case " + (i + 1) + " :");
            dTableau[i] = lectureClavier.nextDouble();
        }
        return dTableau;
    }

    private static void afficherTableau(double [] tableau){
        System.out.println("Voici le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);

        }
    }

}
