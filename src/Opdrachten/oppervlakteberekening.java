package Opdrachten;

import java.util.Scanner;

public class oppervlakteberekening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char doorgaan;

        do {
            int basis = (int) (Math.random() * 9) + 2;
            int hoogte = (int) (Math.random() * 9) + 2;

            System.out.println("Wil je de oppervlakte van een driehoek uitrekenen?");
            System.out.print("Doorgaan (j/n)?: ");
            doorgaan = scanner.next().charAt(0);

            if (doorgaan == 'j') {
                System.out.println("Bereken de oppervlakte van een driehoek met basis " + basis + " en hoogte " + hoogte + ": ");
                double antwoord = scanner.nextDouble();
                double juistAntwoord = berekenOppervlakteDriehoek(basis, hoogte);

                if (antwoord == juistAntwoord) {
                    System.out.println("Jouw antwoord is goed!");
                } else {
                    System.out.println("Jouw antwoord is fout!");
                    System.out.println("Het juiste antwoord is " + juistAntwoord + ".");
                }
            }
        } while (doorgaan == 'j');

        System.out.println("Het programma wordt nu gestopt.");
    }

    public static double berekenOppervlakteDriehoek(int basis, int hoogte) {
        return 0.5 * basis * hoogte;
    }
}
