package Opdrachten;
import java.util.Scanner;

public class BsaMonitor {

    public static void main(String[] args) {
        double BOVENGRENS_CIJFER = 10.0;
        final double ONDERGRENS_CIJFER = 1.0;
        final double CESUUR = 5.5;
        final double BSA_RATIO = 5/6.0;

        Scanner scanner = new Scanner(System.in);
        // arrays voor vaknamen, vakpunten en cijfers, let op de typen
        // vakNamen direct met waarden geinitialiseerd, de lengte wordt dan ook vastgelegd, gebruikt deze in de andere arrays gezien dit de aanwezige vakken zijn
        String[] vakNamen = {"Project Fasten Your Seatbelts", "Programming", "User Interaction", "Databases", "OOP 1", "Personal Skills", "Project Skills " };
        int[] vakPunten = { 12, 3, 3, 3, 3, 2, 2};
        double[] vakCijfers = new double[vakNamen.length];

        // bepaal het totaal te halen punten met behulp van een methode
        int totaalTeHalenPunten = bepaalTotaalPunten(vakPunten);

        // zet vast een variabel klaar voor de gehaalde punten
        int totaalBehaaldeStudiePunten;

        // gebruiker voor ieder vak zijn/haar behaalde cijfer in te laten voeren
        // voeren. Gebruik een for-loop en sla de ingevoerde cijfers op in de array vakCijfers.
        System.out.println("Voer behaalde cijfers in:");
        for (int index = 0; index < vakNamen.length; index++) {
            System.out.printf("%s: ", vakNamen[index]);

            // Zorg ervoor dat de gebruiker alleen geldige cijfers (tussen de 1.0 en de 10.0) kan invoeren.
            // tenminste 1 keer vragen
            double cijfer;
            do {
                cijfer = scanner.nextDouble();
                // je kunt er nog voor kiezen om wel of geen melding te geven
                if(cijfer <= ONDERGRENS_CIJFER || cijfer > BOVENGRENS_CIJFER) {
                    System.out.printf("Ongeldige invoer!\nHet in te voeren cijfer dient tussen de %.1f en %.1f te zijn.\nProbeer nogmaals: ", ONDERGRENS_CIJFER, BOVENGRENS_CIJFER );
                }

            } while (cijfer <= ONDERGRENS_CIJFER || cijfer > BOVENGRENS_CIJFER);
            // als het cijfer goed is toevoegen aan array
            vakCijfers[index] = cijfer;
        }

        // bepaal of punten zijn behaald
        for (int index = 0; index < vakCijfers.length; index++) {
            // verander niks aan array vakPunten bij voldoende
            if(vakCijfers[index] < CESUUR) {
                // indien onvoldoende wijzig vakPunten op huidige index naar 0
                vakPunten[index] = 0;
            }
        }
        totaalBehaaldeStudiePunten = bepaalTotaalPunten(vakPunten);

        System.out.println(); // lege regel
        // print overzicht
        for (int index = 0; index < vakNamen.length; index++) {
            System.out.printf("Vak/project: %-30s Cijfer: %-4.1f Behaalde punten: %-3d\n", vakNamen[index], vakCijfers[index], vakPunten[index]);
        }

        // print totaal aantal behaalde punten
        System.out.printf("\nTotaal behaalde studiepunten: %d/%d\n", totaalBehaaldeStudiePunten, totaalTeHalenPunten); // lege regel
        // print BSA waarschuwing als behaalde punten kleiner dan gegeven ratio
        if(totaalBehaaldeStudiePunten < BSA_RATIO * totaalTeHalenPunten) {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }
    }

    /**
     * Methode om van een array het totaal te bepalen
     */
    public static int bepaalTotaalPunten(int[] mpPuntenRij) {
        int totaal = 0;
        for (int index = 0; index < mpPuntenRij.length; index++) {
            totaal += mpPuntenRij[index];
        }
        return totaal;
    }
}
