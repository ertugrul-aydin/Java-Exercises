package Opdrachten;

import java.util.Scanner;

public class TafelPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declareer variabelen
        int tafel;
        int afdukken;
        char doorgaan = 1;
        do {
            System.out.println("Welke tafel wilt u afdrukken (0=stoppen)?");
            tafel = sc.nextInt();
            if (tafel == 0) break;
            System.out.println("Hoeveel getallen wilt u afdrukken?");
            afdukken = sc.nextInt();
            int eersttafel = tafel;
            for (int i = 1; i <= afdukken; i++) {
                if  (i % 5 == 1) {
                    System.out.println();
                    System.out.print("\t" + tafel);
                } else {

                    System.out.print("\t" + tafel);
                }
                tafel += eersttafel;
            }
            System.out.println();
        } while (doorgaan != 0);
    }
}
