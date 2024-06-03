package Model;

public class Verbruik {

    private final static double BASIS_KOSTEN = 9.95;
    private final static int VERBRUIK_ABONNEMENT = 3000;
    private final static double MEERPRIJS_MB = 0.025;

    private String maand;
    private int hoeveelheidMb;
    private double kosten;


    public Verbruik(String maand, int hoeveelheidMb) {
        this.maand = maand;
        this.hoeveelheidMb = hoeveelheidMb;
    }

    public Verbruik(String maand) {
        this(maand, 0);
    }

    public Verbruik() {
        this("Onbekend");
    }

    public void berekenKosten() {
        kosten = BASIS_KOSTEN;
        if (hoeveelheidMb > VERBRUIK_ABONNEMENT) {
            kosten = (hoeveelheidMb - VERBRUIK_ABONNEMENT) * MEERPRIJS_MB;
        }
    }

    public void toonVerbruik() {
        String info = "";
        if (hoeveelheidMb > VERBRUIK_ABONNEMENT) {
            info = "buiten je bundel!";
        }
        System.out.printf("%-14s%5d%7.2f %20s\n", maand, hoeveelheidMb, kosten, info );
    }

    public String getMaand() {
        return maand;
    }

    public void setHoeveelheidMb(int hoeveelheidMb) {
        this.hoeveelheidMb = hoeveelheidMb;
    }
}
