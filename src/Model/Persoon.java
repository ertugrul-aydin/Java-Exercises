package Model;

public class Persoon {
    private final static double GRENSWAARDE_BONUS = 4500.00;
    public static int aantalPersonen;
    private final int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;
    private Afdeling afdeling;

    public Persoon(String naam, String woonplaats, double maandSalaris, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        setMaandSalaris(maandSalaris);
        this.afdeling = afdeling;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, "onbekend", 0, new Afdeling());
    }

    public Persoon() {
        this("onbekend");
    }

    public double berekenJaarInkomen() {
        return 12 * maandSalaris;
    }

    public boolean heeftRechtOpBonus(){
        return maandSalaris >= GRENSWAARDE_BONUS;
    }

    public static int getAantalPersonen() {
        return aantalPersonen;
    }


    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris < 0) {
            System.out.println("Het maandsalaris mag niet negatief zijn. Het wordt op 0 gezet.");
            this.maandSalaris = 0.0;
        } else {
            this.maandSalaris = maandSalaris;
        }
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }
}
