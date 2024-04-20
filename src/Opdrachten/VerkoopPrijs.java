package Opdrachten;

/*
 * @author Ertugrul Aydin
 * Omschrijving: Verkoopprijs berekenen op basis van
 * een inkoopprijs, winstmarge en een BTW tarief naar keuze.*/

import java.util.Scanner;

public class VerkoopPrijs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // contacten voor BTW hoog en laag
        final int BTW_HOOG = 21;
        final int BTW_LAAG = 6;

        // Vragen stellen
        System.out.println("Inkoopprijs: ");
        double inKoopPrijs = input.nextDouble();

        System.out.println("Winstmarge (in %): ");
        int winstMarge = input.nextInt();

        // Berekenen verkooprijs op basis van winstmarge
        double exVerkoopPrijs = inKoopPrijs + (inKoopPrijs * (winstMarge / 100.0));

        // Printen van resultaten
        System.out.println(exVerkoopPrijs);


        // vraag naar BTW_TARIEF
        System.out.println();

        System.out.print("Onder welk BTW-tarief valt het product?\n \t1 Hoog \n\t2 Laag\n");
        System.out.print("Geef je keuze: ");
        int tariefKeuze = input.nextInt();
        System.out.println();

        double inVerkoopPrijs;
        switch (tariefKeuze) {

            case 1:
                inVerkoopPrijs = exVerkoopPrijs + exVerkoopPrijs * (BTW_HOOG / 100.0);
                System.out.println("Verkoopprijs inclusief " + BTW_HOOG + "% BTW: " + inVerkoopPrijs);
                break;

            case 2:
                inVerkoopPrijs = exVerkoopPrijs + exVerkoopPrijs * (BTW_LAAG / 100.0);
                System.out.println("Verkoopprijs inclusief " + BTW_LAAG + "% BTW: " + inVerkoopPrijs);
                break;
            default:
                System.out.println("Je maakt een ongeldige keuze.");
        }
    }
}
