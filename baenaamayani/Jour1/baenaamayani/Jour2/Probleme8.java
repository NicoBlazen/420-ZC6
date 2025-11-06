package baenaamayani.Jour2;

import java.util.Scanner;
import java.util.ArrayList;

public class Probleme8 {

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args) {

        demanderMot();
        lectureClavier.close();
    }

    public static void demanderMot(){
        ArrayList<String> mots = new ArrayList<String>();
        boolean arret = false;
        do {
            System.out.print("Entrer un mot. Le mot 'stop' arrêtera votre saisie: ");
            String mot = lectureClavier.nextLine().toLowerCase();
            if(mot.equals("stop")){
                arret = true;
            }
            else mots.add(mot);
        } while (!arret);

        mots.sort(null);
        String premier = mots.getFirst();
        String dernier = mots.getLast();

        System.out.println("Premier mot en ordre alphabétique :" + mots.getFirst());
        System.out.println("Dernier mot en ordre alphabétique :" + mots.getLast());
    }


}
