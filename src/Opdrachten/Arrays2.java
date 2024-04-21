package Opdrachten;

import java.util.Scanner;
public class Arrays2 {

    public static void main(String[] args) {
        Scanner invoervrager = new Scanner(System.in);
        System.out.print("Hoeveel getallen wil je genereren? ");
        int aantalGetallen = invoervrager.nextInt();
        System.out.print("Wat is het grootste getal dat mag voorkomen? ");
        int maximumGetal = invoervrager.nextInt();
        int[] rijGetallen = maakRandomRijGetallen(aantalGetallen, maximumGetal);
        System.out.print("Dit zijn de getallen: ");
        for (int getalTeller = 0; getalTeller < rijGetallen.length; getalTeller++) {
            System.out.print(rijGetallen[getalTeller] + "  ");
        }
        System.out.println();
        System.out.println("De som is: " + somVanRij(rijGetallen));
        System.out.println("Het gemiddelde is: " + gemiddeldeVanRij(rijGetallen));
        System.out.println("Het minimum is: " + minimumVanRij(rijGetallen));
        System.out.println("---------------------------");
        int[] rijGetallen2 = maakRandomRijGetallen(1000, 50);
        System.out.println("Het getal 23 komt " + telVoorkomensInRij(rijGetallen2, 23) + " voor");
        int[] aantalVoorkomens = telVoorkomensInRijPerGetal(rijGetallen2, 50);
        System.out.println("Overzicht van voorkomens van getallen in rij:");
        for (int voorkomenTeller = 0; voorkomenTeller < aantalVoorkomens.length; voorkomenTeller++) {
            System.out.println("Getal " + (voorkomenTeller + 1) + " komt " +
                    aantalVoorkomens[voorkomenTeller] + " voor.");
        }
    }

    public static int[] maakRandomRijGetallen(int mpAantal, int mpMaximum) {
        int[] resultaatRij = new int[mpAantal];
        for (int getalteller = 0; getalteller < mpAantal; getalteller++) {
            resultaatRij[getalteller] = maakRandomGetal(mpMaximum);
        }
        return resultaatRij;
    }

    public static int maakRandomGetal(int mpMaximum) {
        return (int) (Math.random() * mpMaximum) + 1;
    }

    public static int somVanRij(int[] mpRij) {
        int som = 0;
        for (int arrayTeller = 0; arrayTeller < mpRij.length; arrayTeller++) {
            som += mpRij[arrayTeller];
        }
        return som;
    }

    public static double gemiddeldeVanRij(int[] mpRij) {
        int som = somVanRij(mpRij);
        return (double) som / mpRij.length;
    }

    public static int minimumVanRij(int[] mpRij) {
        int minimum = mpRij[0];
        for (int arrayTeller = 1; arrayTeller < mpRij.length; arrayTeller++) {
            if (mpRij[arrayTeller] < minimum) {
                minimum = mpRij[arrayTeller];
            }
        }
        return minimum;
    }

    public static int telVoorkomensInRij(int[] mpRij, int mpGetal) {
        int teller = 0;
        for (int arrayTeller = 0; arrayTeller < mpRij.length; arrayTeller++) {
            if (mpRij[arrayTeller] == mpGetal) {
                teller++;
            }
        }
        return teller;
    }

    public static int[] telVoorkomensInRijPerGetal(int[] mpRij, int mpBovengrens) {
        int[] aantalVoorkomens = new int[mpBovengrens];
        for (int arrayTeller = 0; arrayTeller < mpBovengrens; arrayTeller++) {
            aantalVoorkomens[arrayTeller] = telVoorkomensInRij(mpRij, arrayTeller + 1);
        }
        return aantalVoorkomens;
    }
}
