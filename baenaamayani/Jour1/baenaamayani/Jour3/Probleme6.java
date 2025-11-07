package baenaamayani.Jour3;

public class Probleme6 {
    public static void main(String[] args) {

        int[] iTableauA = {-65, -34, 7, -3, -43, 14, 23, -9, 45, 11};

        int iSommePositifs = calculerSommePositifs(iTableauA);
        int iSommeNegatifs = calculerSommeNegatifs(iTableauA);

        System.out.println("Somme des positifs du tableau A: " + iSommePositifs);
        System.out.println("Somme des négatifs du tableau A: " + iSommeNegatifs);

        int[] iTableauB = new int[10];
        remplirTableauAleatoire(iTableauB, -100, 100);

        int iSommePositifsB = calculerSommePositifs(iTableauB);
        int iSommeNegatifsB = calculerSommeNegatifs(iTableauB);

        afficherTableau(iTableauB);

        System.out.println("Somme des positifs du tableau B: " + iSommePositifsB);
        System.out.println("Somme des négatifs du tableau B: " + iSommeNegatifsB);


        
    }

    public static int calculerSommePositifs(int[] tableau){
        int iSomme = 0;
        for(int i = 0; i < tableau.length; i++){
            if(tableau[i] > 0){
                iSomme += tableau[i];
            }
        }
        return iSomme;
    }

    public static int calculerSommeNegatifs(int[] tableau){
        int iSomme = 0;
        for(int i = 0; i < tableau.length; i++){
            if(tableau[i] < 0){
                iSomme += tableau[i];
            }
        }
        return iSomme;
    }

        public static void remplirTableauAleatoire(int[] iTableau, int iMin, int iMax) {
        for (int i = 0; i < iTableau.length; i++) {
            iTableau[i] = (int) (Math.random() * (iMax - iMin + 1)) + iMin;
        }
    }

    private static void afficherTableau(int[] tableau){
        for (int val : tableau) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

}
