package Opdrachten;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        final double KOERS_DOLLAR = 1.23843;
        final double KOERS_POND = 0.88459;
        final double KOERS_YEN = 134.64711;

        Scanner sc = new Scanner(System.in);
        // input gebruiker vragen
        System.out.println("In te wisselen bedrag (alleen gehele getallen):");
        int bedrag = sc.nextInt();
        // Transactiekosten berekenen met behulp van een methode

        double transactiekosten = berekenTransactiekosten(bedrag);
        double omTeWisselenBedrag = bedrag - transactiekosten;

        System.out.println("De transactiekosten bedragen " + transactiekosten + " Euro.");
        System.out.println("We rekenen daarom " + omTeWisselenBedrag + " Euro voor u om.");

        System.out.println("U krijgt hiervoor " + berekenBedragVreemdeValuta(omTeWisselenBedrag, KOERS_DOLLAR) + "  Dollar. (Koers " + KOERS_DOLLAR + ")");
        System.out.println("U krijgt hiervoor " + berekenBedragVreemdeValuta(omTeWisselenBedrag, KOERS_POND) + "  Pond. (Koers " + KOERS_POND + ")");
        System.out.println("U krijgt hiervoor " + berekenBedragVreemdeValuta(omTeWisselenBedrag, KOERS_YEN) + "  Yen. (Koers " + KOERS_YEN + ")");
    }

    public static int berekenBedragVreemdeValuta(double mpBedragInEuro, double mpWisselkoers) {
        return (int) Math.round(mpBedragInEuro * mpWisselkoers);
    }

    public static double berekenTransactiekosten(int bedrag) {
        double transactieKosten = bedrag * 0.015;
        if (transactieKosten < 2) {
            transactieKosten = 2;
        } else if (transactieKosten > 10) {
            transactieKosten = 10;
        }
        return transactieKosten;
    }
}
