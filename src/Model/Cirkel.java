package Model;

public class Cirkel extends Figuur {
    private double straal;
    private Punt middelpunt;


    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        this.straal = straal;
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULTWAARDE_KLEUR);
    }

    public Cirkel() {
        this(1);
    }


    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.out.println("De straal moet positief zijn. De straal wordt op 1 gezet");
            this.straal = 1.0;
        } else {
            this.straal = straal;
        }
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    public void setMiddelpunt(Punt middelpunt) {
        this.middelpunt = middelpunt;
    }

}

