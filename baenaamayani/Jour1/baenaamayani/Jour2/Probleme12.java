package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme12 {

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args) {

        int iMin = lireNombre("Entrer un minimum : ");

        int iMax = lireMaximumValide(iMin);

        int iSomme = sommeMinMax(iMin, iMax);

        afficherSommeDetail(iMin, iMax, iSomme);

        lectureClavier.close();
    }

    public static int lireNombre(String sMessage) {
        System.out.print(sMessage);
        return lectureClavier.nextInt();
    }

    public static int lireMaximumValide(int iMin) {
        int iMax;
        do {
            iMax = lireNombre("Entrer un maximum : ");
            if (iMax <= iMin) {
                System.out.println("Le maximum doit être supérieur au minimum. Réessayez.");
            }
        } while (iMax <= iMin);
        return iMax;
    }

    public static int sommeMinMax(int iMin, int iMax) {
        int iSomme = 0;
        for (int i = iMin; i <= iMax; i++) {
            iSomme += i;
        }
        return iSomme;
    }

    public static void afficherSommeDetail(int iMin, int iMax, int iSomme) {
        System.out.print("Somme : ");
        for (int i = iMin; i <= iMax; i++) {
            System.out.print(i);
            if (i < iMax) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + iSomme);
    }
}
