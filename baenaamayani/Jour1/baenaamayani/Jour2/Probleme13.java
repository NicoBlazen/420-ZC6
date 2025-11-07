package baenaamayani.Jour2;

import java.util.Scanner;

public class Probleme13 {

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args) {
        
        double dTemperature = lireTemperature();
        String sConversion = lireConversion();
        double dResultat = convertirTemperature(dTemperature, sConversion);

        afficherResultat(dResultat, sConversion);

        lectureClavier.close();
    }

    public static double lireTemperature() {
        System.out.print("Entrer une température : ");
        return lectureClavier.nextDouble();
    }

    public static String lireConversion() {
        lectureClavier.nextLine();
        String sConversion;
        do {
            System.out.print("Vers Celsius (C) ou vers Fahrenheit (F) ? : ");
            sConversion = lectureClavier.nextLine().trim().toLowerCase();
        } while (!sConversion.equals("c") && !sConversion.equals("f"));
        return sConversion;
    }

    public static double convertirTemperature(double dTemperature, String sConversion) {
        if (sConversion.equals("f")) {
            return (dTemperature - 32) * 5 / 9;
        } else {
            return dTemperature * 9 / 5 + 32;
        }
    }

    public static void afficherResultat(double dTemperature, String sConversion) {
        System.out.println("Température : " + dTemperature + "°" + sConversion.toUpperCase());
    }
}
