package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme13 {

    private static Scanner lectureClavier = new Scanner(System.in);
    public static void main(String[] args) {
        double dTemp = 0;
        String sConversion;


        System.out.print("Entrer une température :");
        dTemp = lectureClavier.nextDouble();
        lectureClavier.nextLine(); // problème avec juste un nextline qui fait apparaitre le header deux fois
        do{
            System.out.print("Vers celsius ou vers fahrenheit :");
            sConversion = lectureClavier.nextLine();
        } while(sConversion.toLowerCase().equals("f") == false && sConversion.toLowerCase().equals("c") == false);

        System.out.println("Température : " +
            (
                sConversion.toLowerCase().equals("f") ?
                (dTemp - 32) * 5 / 9:
                dTemp * 9 / 5 + 32
            )
            + "°" + sConversion.toUpperCase()
        );

        lectureClavier.close();
    }
}
