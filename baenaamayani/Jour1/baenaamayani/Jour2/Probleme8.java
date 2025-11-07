package baenaamayani.Jour2;

import java.util.Scanner;
import java.util.ArrayList;

public class Probleme8 {

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args) {
        demanderMot();
        lectureClavier.close();
    }

    public static void demanderMot() {
        ArrayList<String> lMots = new ArrayList<String>();
        boolean bArret = false;

        do {
            System.out.print("Entrer un mot. Le mot 'stop' arrêtera votre saisie: ");
            String sMot = lectureClavier.nextLine().toLowerCase();

            if (sMot.equals("stop")) {
                bArret = true;
            } else {
                lMots.add(sMot);
            }
        } while (!bArret);

        if (!lMots.isEmpty()) {
            lMots.sort(null);

            String sPremier = lMots.get(0); 
            String sDernier = lMots.get(lMots.size() - 1); 

            System.out.println("Premier mot en ordre alphabétique : " + sPremier);
            System.out.println("Dernier mot en ordre alphabétique : " + sDernier);
        } else {
            System.out.println("Aucun mot n'a été saisi.");
        }
    }
}
