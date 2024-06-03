package Model;

public class Wedstrijd {
    private Team thuisTeam;
    private Team uitTeam;
    private int thuisDoelpunten;
    private int uitDoelpunten;

    public Wedstrijd(Team thuisTeam, Team uitTeam, int thuisDoelpunten, int uitDoelpunten) {
        this.thuisTeam = thuisTeam;
        this.uitTeam = uitTeam;
        this.thuisDoelpunten = thuisDoelpunten;
        this.uitDoelpunten = uitDoelpunten;
    }

    public Wedstrijd(Team thuisTeam, Team uitTeam) {
        this(thuisTeam, uitTeam, 0, 0);
    }

    public Wedstrijd() {
        this(new Team(), new Team());
    }

    public int getWedstrijdPuntenThuisTeam() {
        if (thuisDoelpunten > uitDoelpunten) {
            return 3;
        } else if (thuisDoelpunten == uitDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getWedstrijdPuntenUitTeam() {
        if (thuisDoelpunten < uitDoelpunten) {
            return 3;
        } else if (thuisDoelpunten == uitDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setWedstrijdPuntenThuisTeam() {
        int wedstrijdpuntenThuisTeam = thuisTeam.getTotaalWedstrijdPunten();
        thuisTeam.setTotaalWedstrijdPunten(wedstrijdpuntenThuisTeam + this.getWedstrijdPuntenThuisTeam());
    }

    public void setWedstrijdPuntenUitTeam() {
        int wedstrijdpuntenUitTeam = uitTeam.getTotaalWedstrijdPunten();
        uitTeam.setTotaalWedstrijdPunten(wedstrijdpuntenUitTeam + this.getWedstrijdPuntenUitTeam());
    }

    public void setTotaalDoelpuntenTeams() {
        // 1. Werk het totaalVoorDoelpunten voor het thuisTeam bij.
        // Haal eerst het huidige totaalVoorDoelpunten van het thuisTeam op
        int totaalVoorDoelpuntenThuisTeam = thuisTeam.getTotaalVoorDoelpunten();
        // Verhoog dit met de voorDoelpunten in deze wedstrijd (= thuisDoelpunten)
        totaalVoorDoelpuntenThuisTeam += thuisDoelpunten;
        // Sla de nieuwe waarde op voor het thuisTeam
        thuisTeam.setTotaalVoorDoelpunten(totaalVoorDoelpuntenThuisTeam);

        // 2. Werk het totaalTegenDoelpunten voor het thuisTeam bij.
        // Haal eerst het huidige totaalTegenDoelpunten van het thuisTeam op
        int totaalTegenDoelpuntenThuisTeam = thuisTeam.getTotaalTegenDoelpunten();
        // Verhoog dit met de tegenDoelpunten in deze wedstrijd (= uitDoelpunten)
        totaalTegenDoelpuntenThuisTeam += uitDoelpunten;
        // Sla de nieuwe waarde op voor het thuisTeam
        thuisTeam.setTotaalTegenDoelpunten(totaalTegenDoelpuntenThuisTeam);

        // 3. Werk het totaalVoorDoelpunten voor het uitTeam bij.
        // Haal eerst het huidige totaalVoorDoelpunten van het uitTeam op
        int totaalVoorDoelpuntenUitTeam = uitTeam.getTotaalVoorDoelpunten();
        // Verhoog dit met de voorDoelpunten in deze wedstrijd (= uitDoelpunten!!!)
        totaalVoorDoelpuntenUitTeam += uitDoelpunten;
        // Sla de nieuwe waarde op voor het uitTeam
        uitTeam.setTotaalVoorDoelpunten(totaalVoorDoelpuntenUitTeam);

        // 4. Werk het totaalTegenDoelpunten voor het uitTeam bij.
        // Haal eerst het huidige totaalTegenDoelpunten van het uitTeam op
        int totaalTegenDoelpuntenUitTeam = uitTeam.getTotaalTegenDoelpunten();
        // Verhoog dit met de tegenDoelpunten in deze wedstrijd (= thuisDoelpunten!!!)
        totaalTegenDoelpuntenUitTeam += thuisDoelpunten;
        // Sla de nieuwe waarde op voor het uitTeam
        uitTeam.setTotaalTegenDoelpunten(totaalTegenDoelpuntenUitTeam);
        int totaaltegenUit = uitTeam.getTotaalTegenDoelpunten();

        // N.B. Je kunt de drie regels per stap ook combineren tot één regel.
        // Bijvoorbeeld de laatste stap wordt:
        // uitTeam.setTotaalTegenDoelpunten(uitTeam.getTotaalTegenDoelpunten() + thuisDoelpunten);
    }

    public void printUitslag() {
        System.out.println("De uitslag van de wedstrijd " + this.thuisTeam.getTeamNaam() + "-" + this.uitTeam.getTeamNaam() + ": " + this.thuisDoelpunten + "-" + this.uitDoelpunten);
    }

    public void printWedstrijdPunten() {
        if (getWedstrijdPuntenThuisTeam() == 1) {
            System.out.printf("Dit levert 1 wedstrijdpunt voor %s en 1 wedstrijdpunt voor %s.\n", thuisTeam, uitTeam);
        } else {
            System.out.printf("Dit levert %d wedstrijdpunten voor %s en %d wedstrijdpunten voor %s.\n",
                    getWedstrijdPuntenThuisTeam(), thuisTeam.getTeamNaam(), getWedstrijdPuntenUitTeam(),
                    uitTeam.getTeamNaam());
        }
    }

    public Team getThuisTeam() {
        return thuisTeam;
    }

    public void setThuisTeam(Team thuisTeam) {
        this.thuisTeam = thuisTeam;
    }

    public Team getUitTeam() {
        return uitTeam;
    }

    public void setUitTeam(Team uitTeam) {
        this.uitTeam = uitTeam;
    }

    public int getThuisDoelpunten() {
        return thuisDoelpunten;
    }

    public void setThuisDoelpunten(int thuisDoelpunten) {
        this.thuisDoelpunten = thuisDoelpunten;
    }

    public int getUitDoelpunten() {
        return uitDoelpunten;
    }

    public void setUitDoelpunten(int uitDoelpunten) {
        this.uitDoelpunten = uitDoelpunten;
    }

}
