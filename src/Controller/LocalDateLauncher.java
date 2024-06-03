package Controller;

import java.time.LocalDate;

public class LocalDateLauncher {
    public static void main(String[] args) {
        // Geeft de dag van vandaag
        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);
        // Een manier om 1 januari 2021 als LocalDate in te voeren.
        LocalDate beginVan2021 = LocalDate.parse("2021-01-01");
        System.out.println(beginVan2021);
        // Een andere manier om een datum in te voeren
        LocalDate koningsDag2021 = LocalDate.of(2021, 04, 27);
        System.out.println(koningsDag2021);

        // Een paar voorbeelden van methodes binnen de LocalDate klasse
        int maandVanKoningsDag2021 = koningsDag2021.getMonthValue();
        System.out.println(maandVanKoningsDag2021);

        String dagVanDeWeek = koningsDag2021.getDayOfWeek().toString();
        System.out.println(dagVanDeWeek);

        // Twaalf dagen na de Koningsdag van 2021
        System.out.println(koningsDag2021.plusDays(12));
        // Vijf maanden na de Koningsdag van 2021
        System.out.println(koningsDag2021.plusMonths(5));
        // Drie jaar na vandaag
        System.out.println(vandaag.plusYears(3));
        // Komt de Koningsdag van 2021 na vandaag?
        if (koningsDag2021.isAfter(vandaag)) {
            System.out.println("Vandaag is het voor 27 april 2021");
        } else if (koningsDag2021.equals(vandaag)) {
            System.out.println("Vandaag is het 27 april 2021");
        } else {
            System.out.println("Vandaag is het na 27 april 2021");
        }
        if (beginVan2021.isBefore(vandaag.minusMonths(3))) {
            System.out.println("Nieuwjaarsdag 2021 is meer dan drie maanden geleden");
        }
    }
}
