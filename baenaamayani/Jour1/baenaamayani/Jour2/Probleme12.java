package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme12 {

    private static Scanner lectureClavier = new Scanner(System.in);

    static int sommeMinMax(int min, int max){
        int somme = 0;
        for(int i = min; i <= max; i++){
            somme += i;
        }

        return somme;
    }

    public static void main(String[] args) {
        int iMin, iMax;
        System.out.print("Entrer un minimum >> "); iMin = lectureClavier.nextInt();
        System.out.print("Entrer un maximum >> "); iMax = lectureClavier.nextInt();
        System.out.println("Somme de tout: " + sommeMinMax(iMin,iMax));
        lectureClavier.close();
    }
}
