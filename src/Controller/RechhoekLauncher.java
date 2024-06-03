package Controller;

import Model.Rechthoek;
import Model.Punt;
public class RechhoekLauncher {

    public static void main(String[] args) {

        System.out.println(Rechthoek.geefDefinitie());
        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);
        for (int arrayTeller = 0; arrayTeller < mijnRechthoekArray.length; arrayTeller++) {
            System.out.println(mijnRechthoekArray[arrayTeller].geefOmtrek());
            System.out.println(mijnRechthoekArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnRechthoekArray[arrayTeller].getHoekpuntLinksboven().getxCoordinaat());
            System.out.println(mijnRechthoekArray[arrayTeller].getHoekpuntLinksboven().getyCoordinaat());
            System.out.println(mijnRechthoekArray[arrayTeller].vertelOverGrootte());
        }
    }
}
