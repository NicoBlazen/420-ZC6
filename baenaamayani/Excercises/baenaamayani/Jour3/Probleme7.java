package baenaamayani.Jour3;

public class Probleme7 {

    public static void main(String[] args) {
        int[] iTableau = new int[10];
        remplirTableauAleatoire(iTableau, 0, 4);

        System.out.print("Tableau : ");
        afficherTableau(iTableau);

        int[] iOccurences = new int[5];

        for (int i = 0; i < iOccurences.length; i++) {
            iOccurences[i] = compterOccurrences(iTableau, i);
        }

        System.out.println("Nombre d'occurrences :");
        afficherOccurrences(iOccurences);
    }

    public static void remplirTableauAleatoire(int[] iTableau, int iMin, int iMax) {
        for (int i = 0; i < iTableau.length; i++) {
            iTableau[i] = (int) (Math.random() * (iMax - iMin + 1)) + iMin;
        }
    }

    public static void afficherTableau(int[] iTableau) {
        for (int iValeur : iTableau) {
            System.out.print(iValeur + " ");
        }
        System.out.println();
    }

    public static int compterOccurrences(int[] iTableau, int iValeur) {
        int iCompteur = 0;
        for (int val : iTableau) {
            if (val == iValeur) {
                iCompteur++;
            }
        }
        return iCompteur;
    }


    public static void afficherOccurrences(int[] iOccurences) {
        for (int i = 0; i < iOccurences.length; i++) {
            System.out.println("Valeur " + (i + 1)  + " : " + iOccurences[i] + " fois");
        }
    }
}
