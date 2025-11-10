package baenaamayani.Jour1;

import java.util.Scanner;

public class Probleme4 {
    
    private static Scanner lectureClavier = new Scanner(System.in);
    
    public static void main(String[] args) {

        int iNote = entrerNote();

        afficherResultat(iNote);

        lectureClavier.close();
    }

    public static int entrerNote()
    {
        System.out.println("Quelle est votre note? : ");
        int iNote = lectureClavier.nextInt();
        return iNote;
    }

    public static void afficherResultat(int iNote)
    {
        if (iNote >= 60){
            System.out.println("Vous avez passer votre cours de maths");

        } else {
            System.out.println("Vous avez coulé votre cours de maths");
        }
    }

}
