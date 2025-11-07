package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme10{

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args) {
        int a = lireNombre("Entrer un premier nombre entier : ");
        int b = lireNombre("Entrer un deuxième nombre entier : ");

        int max = plusGrand(a, b);

        afficherPlusGrand(max);

        lectureClavier.close();
    }

    public static int lireNombre(String message) {
        System.out.print(message);
        return lectureClavier.nextInt();
    }

    public static int plusGrand(int a, int b) {
        return (a < b ? b : a);
    }

    public static void afficherPlusGrand(int nombre) {
        System.out.println("Le plus grand nombre est : " + nombre);
    }
}
