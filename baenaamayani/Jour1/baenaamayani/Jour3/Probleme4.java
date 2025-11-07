package baenaamayani.Jour3;


public class Probleme4 {
    public static void main(String[] args) {

        int[] monTableau = creerTableauAleatoire();

        afficherTableau(monTableau);

        int iMax = monTableau[0];
        int iMin = monTableau[0];
        int iPosMax = 0;
        int iPosMin = 0;

        for(int i = 1; i < monTableau.length; i++){
            if(monTableau[i] > iMax){
                iMax = monTableau[i];
                iPosMax = i;
            }
            if(monTableau[i] < iMin){
                iMin = monTableau[i];
                iPosMin = i;
            }
        }

        System.out.println("La plus grande valeur est " + iMax + " à la position " + iPosMax);
        System.out.println("La plus petite valeur est " + iMin + " à la position " + iPosMin);
        
    }

    public static int[] creerTableauAleatoire(){
        int[] iTableau = new int[5];

        for(int i = 0; i < iTableau.length; i++){
            iTableau[i] = (int)(Math.random() * 100) + 1;
        }
        return iTableau;
    }

    public static void afficherTableau (int[] tableau){
        System.out.println("Voici le tableau :");
        for(int i = 0; i < tableau.length; i++){
            System.out.println(tableau[i]);
        }
    }
}
