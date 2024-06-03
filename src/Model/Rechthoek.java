package Model;

public class Rechthoek extends Figuur {

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksboven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksboven, String kleur) {
        super(kleur);
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksboven = hoekpuntLinksboven;

    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), DEFAULTWAARDE_KLEUR);
    }

    public Rechthoek() {
        this(2, 1);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken";
    }


    @Override
    public double geefOmtrek() {
        return 2 * lengte + 2 * breedte;
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public Punt getHoekpuntLinksboven() {
        return hoekpuntLinksboven;
    }

    public void setHoekpuntLinksboven(Punt hoekpuntLinksboven) {
        this.hoekpuntLinksboven = hoekpuntLinksboven;
    }

}



