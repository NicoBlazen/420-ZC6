package baenaamayani.Jour2;

import java.util.Scanner;
import java.util.ArrayList;

public class Probleme7 {

     private static Scanner lectureClavier = new Scanner(System.in);
    public static void main(String[] args) {

        

        lectureClavier.close();
        
    }

    public static String demanderPhrase()
    {
        System.out.println("Veuillez entrer une phrase :");
        String sPhrase = lectureClavier.nextLine();
        return sPhrase;
    }

    


}
