package controller;

import java.util.Scanner;

import Model.Team;
import Model.Wedstrijd;

public class VoetbalScoresLauncher {

    public static void main(String[] args) {
        // stap 3: test Team
        Team twente = new Team("Twente", 15, 28, 12);
        twente.printStatusTeam();
        System.out.println();

        // stap 5: test Wedstrijd
        Team ajax = new Team("Ajax");
        Team pec = new Team("PEC");
        Wedstrijd wedstrijd = new Wedstrijd(ajax, pec, 5, 0);
        wedstrijd.printUitslag();
        wedstrijd.printWedstrijdPunten();
        System.out.println();

        // stap 6: basis
        final int AANTAL_TEAMS = 3;
        Team[] teams = new Team[AANTAL_TEAMS];
        teams[0] = new Team("VVV");
        teams[1] = new Team("NAC");
        teams[2] = new Team("PEC");
        final int AANTAL_WEDSTRIJDEN = 6;
        Wedstrijd[] wedstrijden = new Wedstrijd[AANTAL_WEDSTRIJDEN];
        wedstrijden[0] = new Wedstrijd(teams[0],teams[1]);
        wedstrijden[1] = new Wedstrijd(teams[0],teams[2]);
        wedstrijden[2] = new Wedstrijd(teams[1],teams[2]);
        wedstrijden[3] = new Wedstrijd(teams[1],teams[0]);
        wedstrijden[4] = new Wedstrijd(teams[2],teams[0]);
        wedstrijden[5] = new Wedstrijd(teams[2],teams[1]);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < AANTAL_WEDSTRIJDEN; i++) {
            System.out.print("Geef van de wedstrijd " + wedstrijden[i].getThuisTeam().getTeamNaam() + "-" +
                    wedstrijden[i].getUitTeam().getTeamNaam() + " de thuisdoelpunten: ");
            wedstrijden[i].setThuisDoelpunten(input.nextInt());
            System.out.print("Geef van de wedstrijd " + wedstrijden[i].getThuisTeam().getTeamNaam() + "-" +
                    wedstrijden[i].getUitTeam().getTeamNaam() + " de uitdoelpunten: ");
            wedstrijden[i].setUitDoelpunten(input.nextInt());
        }
        for (int i = 0; i < AANTAL_WEDSTRIJDEN; i++) {
            wedstrijden[i].printUitslag();
            wedstrijden[i].setWedstrijdPuntenThuisTeam();
            wedstrijden[i].setWedstrijdPuntenUitTeam();
            wedstrijden[i].setTotaalDoelpuntenTeams();
        }

        for (int i = 0; i < teams.length; i++) {
            teams[i].printStatusTeam();
        }

		/*
		// stap 7 gevorderden
		// Vraag naar aantal teams
		Scanner input = new Scanner(System.in);
		int aantalTeams;
		System.out.print("Voor hoeveel teams wil je wedstrijden bijhouden: ");
		aantalTeams = input.nextInt();
		Team[] teams = new Team[aantalTeams];
		// Vraag naar de namen van de teams
		for (int i = 0; i < teams.length; i++) {
			System.out.print("Geef de naam van team " + (i+1) +": ");
			teams[i] = new Team(input.next());
		}

		// Bepaal het aantal wedstrijden
		int aantalWedstrijden = aantalTeams * (aantalTeams - 1);
		Wedstrijd[] wedstrijden = new Wedstrijd[aantalWedstrijden];
		// Vul de array wedstrijden. Hier wordt de eerste helft van de competitie gevuld.
		int wedstrijdTeller = 0;
		for (int thuisTeamTeller = 0; thuisTeamTeller < aantalTeams - 1; thuisTeamTeller++) {
			for (int uitTeamTeller = thuisTeamTeller + 1; uitTeamTeller < aantalTeams; uitTeamTeller++) {
				wedstrijden[wedstrijdTeller] = new Wedstrijd(teams[thuisTeamTeller], teams[uitTeamTeller]);
				wedstrijdTeller++;
			}
		}

		// Voor de tweede helft van de competitie woorden de thuisTeams en uitTeams gewisseld
		for (int wedstrijdTeller2 = aantalWedstrijden / 2; wedstrijdTeller2 < aantalWedstrijden; wedstrijdTeller2++) {
			int nrHeenWedstrijd = wedstrijdTeller2 - aantalWedstrijden / 2;
			wedstrijden[wedstrijdTeller2] = new Wedstrijd(wedstrijden[nrHeenWedstrijd].getTeamUit(), wedstrijden[nrHeenWedstrijd].getTeamThuis());
		}

		// Vraag naar de uitslagen
		for (int i = 0; i < aantalWedstrijden; i++) {
			System.out.print("Geef van de wedstrijd " + wedstrijden[i].getTeamThuis().getTeamNaam() + "-" +
					wedstrijden[i].getTeamUit().getTeamNaam() + " de thuisdoelpunten: ");
			wedstrijden[i].setVoorDoelpunten(input.nextInt());
			System.out.print("Geef van de wedstrijd " + wedstrijden[i].getTeamThuis().getTeamNaam() + "-" +
					wedstrijden[i].getTeamUit().getTeamNaam() + " de uitdoelpunten: ");
			wedstrijden[i].setTegenDoelpunten(input.nextInt());
		}

		// Toon de resultaten en werk de teams bij.
		for (int i = 0; i < aantalWedstrijden; i++) {
			wedstrijden[i].printUitslag();
			wedstrijden[i].setWedstrijdPuntenThuisTeam();
			wedstrijden[i].setWedstrijdPuntenUitTeam();
			wedstrijden[i].setTotaalDoelpuntenTeams();
		}

		for (int i = 0; i < teams.length; i++) {
			teams[i].printStatusTeam();
		}
	*/
    }
}
