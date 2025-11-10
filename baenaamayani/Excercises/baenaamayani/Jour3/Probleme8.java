package baenaamayani.Jour3;

import java.util.Scanner;

public class Probleme8 {

    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);

        int iNbEtudiants = 8;

        String[] sNom = new String[iNbEtudiants];
        int[] iTP1 = new int[iNbEtudiants];
        int[] iTP2 = new int[iNbEtudiants];
        int[] iExamen1 = new int[iNbEtudiants];

        for (int i = 0; i < iNbEtudiants; i++) {
            System.out.print("Nom de l'étudiant " + (i + 1) + " : ");
            sNom[i] = lectureClavier.nextLine();

            iTP1[i] = lireNote("TP1 : ", lectureClavier);
            iTP2[i] = lireNote("TP2 : ", lectureClavier);
            iExamen1[i] = lireNote("Examen1 : ", lectureClavier);
        }

        System.out.println("Moyennes par évaluation :");
        System.out.println("TP1 : " + moyEval(iTP1));
        System.out.println("TP2 : " + moyEval(iTP2));
        System.out.println("Examen1 : " + moyEval(iExamen1));

        System.out.println("Moyennes par étudiant :");
        for (int i = 0; i < iNbEtudiants; i++) {
            double dMoyenneEtudiant = moyEtu(iTP1[i], iTP2[i], iExamen1[i]);
            System.out.println(sNom[i] + " : " + dMoyenneEtudiant);
        }

        lectureClavier.close();
    }

    public static int lireNote(String sMessage, Scanner lectureClavier) {
        int iNote;
        do {
            System.out.print(sMessage);
            iNote = lectureClavier.nextInt();
            lectureClavier.nextLine();
            if (iNote < 0 || iNote > 100) {
                System.out.println("Erreur : la note doit être entre 0 et 100.");
            }
        } while (iNote < 0 || iNote > 100);
        return iNote;
    }

    public static double moyEval(int[] iNotes) {
        double dSomme = 0;
        for (int i : iNotes) {
            dSomme += i;
        }
        return dSomme / iNotes.length;
    }

    public static double moyEtu(int iTP1, int iTP2, int iExamen1) {
        return (iTP1 + iTP2 + iExamen1) / 3.0;
    }
}
