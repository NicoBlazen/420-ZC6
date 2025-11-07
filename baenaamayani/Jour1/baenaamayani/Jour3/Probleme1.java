package baenaamayani.Jour3;


public class Probleme1 {


    public static void main(String[] args) {

        String[] monTableau = creerTableau();
        
        afficherTableau(monTableau);

    }

    public static String[] creerTableau(){
        String[] sTableau = new String[5];

        sTableau[0] = "Bonjour";
        sTableau[1] = "tout";
        sTableau[2] = "le";
        sTableau[3] = "monde";
        sTableau[4] = "!";
        return sTableau;
    }

    public static void afficherTableau(String[] tableau){
        System.out.println("Voici le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);

        }
    }
}
