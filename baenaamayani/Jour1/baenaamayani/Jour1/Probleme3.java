package baenaamayani.Jour1;

import java.util.Scanner;

public class Probleme3 {

    private static Scanner lectureClavier = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int age1 = nbAge1();
        int age2 = nbAge2();

        moyenneAge(age1, age2);
        comparer(age1, age2);


        lectureClavier.close();

    }

    public static void comparer(int age1, int age2)
    {
        if (age1 == age2){
            System.out.println("Les ages sont pareille");
            return ;
        } else if (age1 < age2){
            afficherVieille(age2);
        } else {
            afficherVieille(age1);
        }
    }

    public static void afficherMoyenne(float moyenne)
    {
        System.out.println("La moyenne des deux âges est de" + moyenne);
    }

    public static void afficherVieille(int age)
    {  
        System.out.println("L'âge la plus vieille " + age);

    }

    public static int nbAge1(){

        System.out.println("Quel est l'age de la première personne");
        int iAge1 = lectureClavier.nextInt();
        return iAge1;
    }

    public static int nbAge2()
    {
        System.out.println("Quel est l'age de la deuxième personne");
        int iAge2 = lectureClavier.nextInt();
        return iAge2;

    }

    public static float moyenneAge(int age1, int age2){
        
        float fMoyenne = (age1 + age2) / 2;
        afficherMoyenne(fMoyenne);
        return fMoyenne;
    }

        


}
