package baenaamayani.Jour3;


public class Probleme3 {

    public static void main(String[] args) {

        int[] monTableau = creerTableauAleatoire();
        afficherTableau(monTableau);

        int[] tableauInverse = inverserTableau(monTableau);
        System.out.println("Voici le tableau inversé :");
        afficherTableau(tableauInverse);
        
    }

    public static int[] creerTableauAleatoire(){

        int[] iTableau = new int[10];

        for(int i = 0; i < iTableau.length; i++){
            iTableau[i] = (int)(Math.random() * 100) + 1;
        }
        return iTableau;
    }

    public static int[] inverserTableau(int[] tableau){
        int[] iTableauInverse = new int[tableau.length];

        for(int i = 0; i < tableau.length; i++){
            iTableauInverse[i] = tableau[tableau.length - 1 - i];
        }
        return iTableauInverse;
    }

    public static void afficherTableau(int [] tableau){
        System.out.println("Voici le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }

}
