package Controller;
import Model.Kofferslot;


public class KofferslotLauncher {

    public static void main(String[] args) {
        // Test de default constructor: AA0;
        Kofferslot eenKoffer = new Kofferslot();
        System.out.print(eenKoffer.getEersteLetter());
        System.out.print(eenKoffer.getTweedeLetter());
        System.out.println(eenKoffer.getCijfer());

        // Test de all-args constructor
        Kofferslot eenTweedeKoffer = new Kofferslot('E', 'T', 6);
        System.out.print(eenTweedeKoffer.getEersteLetter());
        System.out.print(eenTweedeKoffer.getTweedeLetter());
        System.out.println(eenTweedeKoffer.getCijfer());

        // AA0 - AA1
        eenKoffer.volgende();
        System.out.print(eenKoffer.getEersteLetter());
        System.out.print(eenKoffer.getTweedeLetter());
        System.out.println(eenKoffer.getCijfer());

        // BR9 - BS0
        eenKoffer.setCombinatie('B','R',9);
        eenKoffer.volgende();
        System.out.print(eenKoffer.getEersteLetter());
        System.out.print(eenKoffer.getTweedeLetter());
        System.out.println(eenKoffer.getCijfer());

        // DZ9 - EA0
        eenKoffer.setCombinatie('D','Z',9);
        eenKoffer.volgende();
        System.out.print(eenKoffer.getEersteLetter());
        System.out.print(eenKoffer.getTweedeLetter());
        System.out.println(eenKoffer.getCijfer());

        // ZZ9 - AA0
        eenKoffer.setCombinatie('Z','Z',9);
        eenKoffer.volgende();
        System.out.print(eenKoffer.getEersteLetter());
        System.out.print(eenKoffer.getTweedeLetter());
        System.out.println(eenKoffer.getCijfer());
    }

    public static class VoetbalScoresLauncher {
    }
}
