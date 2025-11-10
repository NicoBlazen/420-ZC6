package baenaamayani.Jour3;

public class Probleme5 {
    public static void main(String[] args) {

        int[] monTableau = creerTableauAleatoire();
        
        System.out.println("Tableau avant permutation :");
        afficherTableau(monTableau);

        permuterTableau(monTableau);

        System.out.println("Tableau après permutation :");
        afficherTableau(monTableau);
        
    }

    public static int[] creerTableauAleatoire(){

        int[] iTableau = new int[10];

        for(int i = 0; i < iTableau.length; i++){
            iTableau[i] = (int)(Math.random() * 100) + 1;
        }
        return iTableau;
    }

    private static void afficherTableau(int[] tableau){
        System.out.println("Voici le tableau :");
        for(int i = 0; i < tableau.length; i++){
            System.out.println(tableau[i]);
        }
    }

    private static void permuterTableau(int[] tableau){
        int iNombre = tableau.length;
        for(int i = 0; i < iNombre / 2; i++){
            int iTemporaire = tableau[i];
            tableau[i] = tableau[iNombre - 1 - i];
            tableau[iNombre - 1 - i] = iTemporaire;
        }
    }

}
