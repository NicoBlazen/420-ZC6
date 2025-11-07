package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme11 {

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args) {

        int iNombre = lireNombre("Entrer un nombre entier : ");
        int iFactorielle = calculerFactorielle(iNombre);

        afficherFactorielle(iNombre, iFactorielle);

        lectureClavier.close();
    }

    public static int lireNombre(String sMessage) {
        System.out.print(sMessage);
        return lectureClavier.nextInt();
    }


    public static int calculerFactorielle(int iNombre) {
        int iValeur = 1;
        for (int i = 1; i <= iNombre; i++) {
            iValeur *= i;
        }
        return iValeur;
    }

    public static void afficherFactorielle(int iNombre, int iFactorielle) {
        System.out.println("La factorielle de " + iNombre + " est : " + iFactorielle);
    }
}
