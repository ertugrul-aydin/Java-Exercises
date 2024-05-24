package Opdrachten;

import java.util.Scanner;

public class ParkeerGarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoeveel auto's hebben geparkeerd?");
        int autos = scanner.nextInt();
        String[] kenteken = new String[autos];
        int[] parkeerDuur = new int[autos];
        double[] parkeerKosten = new double[autos];
        double totaleParkeerGelden = 0;

        for (int i = 0; i < autos; i++) {
            System.out.println("Auto " + (i + 1));
            System.out.print("\t Kenteken:");
            kenteken[i] = scanner.next();
            System.out.println();

            boolean opnieuw = false;
            do{
                System.out.print("\tGeparkeerde uren (max. 24):");
                parkeerDuur[i] = scanner.nextInt();

                if (parkeerDuur[i] > 24){
                    System.out.println(" \t De parkeerduur kan maximaal 24 uur zijn.");
                    opnieuw= true;
                }else {
                    opnieuw = false;
                }
            }while(opnieuw);

            parkeerKosten[i] = berekenParkeerKosten(parkeerDuur[i]);

        }

        System.out.println("Parkeeroverzicht");
        System.out.printf("%-10s %-5s %-6s%n", "kenteken", "uren", "bedrag");

        for (int i = 0; i < autos; i++) {
            System.out.printf("%-10s %-5d %-6.2f%n", kenteken[i], parkeerDuur[i], parkeerKosten[i]);
            totaleParkeerGelden += parkeerKosten[i];
        }

        System.out.println("Totaal van alle parkeergelden: " + totaleParkeerGelden);
    }

    public static double berekenParkeerKosten(int uren) {

        double totalbedrag = 0;

        final double EERSTE_TARIEF = 3.75;
        final double VOLGENDE_TARIEF = 2.75;
        final int MAX_KOSTEN = 25;

        for (int i = 1; i <= uren; i++) {
            if (i <= 3)
                totalbedrag += EERSTE_TARIEF;
            else
                totalbedrag += VOLGENDE_TARIEF;
        }

        if (totalbedrag > MAX_KOSTEN) {
            totalbedrag = MAX_KOSTEN;
        }

        return totalbedrag;
    }
}
