package Model;

public class Figuur {
    protected final static double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    protected final static String DEFAULTWAARDE_KLEUR = "wit";
    protected String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULTWAARDE_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten.";
    }

    public double geefOmtrek() {
        return 0;
    }

    public double geefOppervlakte() {
        return 0;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}
