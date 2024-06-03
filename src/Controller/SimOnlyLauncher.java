package Controller;
import Model.Verbruik;

import java.util.Scanner;


public class SimOnlyLauncher {

    public static void main(String[] args) {

        int aantalMaanden = 4;

        Scanner input = new Scanner(System.in);

        Verbruik[] verbruikslijst = new Verbruik[aantalMaanden];

        verbruikslijst[0] = new Verbruik("Juli");
        verbruikslijst[1] = new Verbruik("Augustus");
        verbruikslijst[2] = new Verbruik("September");
        verbruikslijst[3] = new Verbruik("Oktober");

        for (int i = 0; i < verbruikslijst.length; i++) {
            System.out.println("Geef je dataverbruik in MB per maand:");
            System.out.print(verbruikslijst[i].getMaand() + ": ");
            verbruikslijst[i].setHoeveelheidMb(input.nextInt());
        }

        System.out.println();

        for (int i = 0; i < verbruikslijst.length; i++) {
            verbruikslijst[i].berekenKosten();
        }

        System.out.printf("%-14s%5s%7s \n", "MAAND", "MB", "KOSTEN");
        for (int i = 0; i < aantalMaanden; i++) {
            verbruikslijst[i].toonVerbruik();
        }

    }

}
