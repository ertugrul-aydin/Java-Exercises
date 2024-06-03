package Controller;

import Model.Persoon;
import Model.Afdeling;


public class BedrijfLauncher {

    public static void main(String[] args) {
        /* Restant van dagdeel 2
        System.out.println(Persoon.aantalPersonen);
        Persoon ert = new Persoon("ert", "nederhorst", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(ert.getPersoneelsNummer());
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());
        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);

        String uitvoerString = "";

        if (ert.heeftRechtOpBonus()){
            uitvoerString = " en heeft wel recht op een bonus.\n";
        } else {
            uitvoerString = " en heeft geen recht op een bonus.\n";
        }

        System.out.printf("%s verdient %.2f" + uitvoerString, ert.getNaam(), ert.getMaandSalaris());

        if (medewerker.heeftRechtOpBonus()) {
            uitvoerString = " en heeft wel recht op een bonus.\n";
        } else {
            uitvoerString = " en heeft geen recht op een bonus.\n";
        }
        System.out.printf("%s verdient %.2f" + uitvoerString, medewerker.getNaam(), medewerker.getMaandSalaris());

          Einde restant van dagdeel 2* */


        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");
        Persoon baas = new Persoon("Mark", "Den Haag", 10000, afdelingen[2]);
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000, afdelingen[1]);
        Persoon assistent = new Persoon("Klaas");
        System.out.println("Het aantal personen in het bedrijf is "+ Persoon.aantalPersonen);
        System.out.printf("%s werkt in %s en woont in %s\n", baas.getNaam(), baas.getAfdeling().getAfdelingsPlaats(),
                baas.getWoonplaats());
        System.out.printf("%s werkt op de afdeling %s en verdient %.2f\n", medewerker.getNaam(), medewerker.getAfdeling().getAfdelingsNaam(),
                medewerker.getMaandSalaris());
        System.out.printf("%s werkt op de afdeling %s en woont in %s\n", assistent.getNaam(), assistent.getAfdeling().getAfdelingsNaam(),
                assistent.getWoonplaats());

    }

}
