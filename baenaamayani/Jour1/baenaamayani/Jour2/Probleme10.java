package baenaamayani.Jour2;

import java.util.Scanner;


public class Probleme10 {

    private static Scanner lectureClavier = new Scanner(System.in);

    static int plusGrand(int a, int b){
        return (a < b ? b : a);
    }
    public static void main(String[] args) {
        int a, b;
        System.out.print("Entrer un nombre entier :"); a = lectureClavier.nextInt();
        System.out.print("Entrer un nombre entier :"); b = lectureClavier.nextInt();
        System.out.println("Plus gros nombre : " + plusGrand(a,b));
        lectureClavier.close();
    }
}
