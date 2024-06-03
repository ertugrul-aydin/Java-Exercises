package Controller;

import Model.Cirkel;
import Model.Punt;
import Model.Rechthoek;

public class MeetkundeLauncher {
    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[4];
        mijnCirkelArray[0] = new Cirkel(3, new Punt(1,4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(1);

        Punt middelpuntCirkel3 = new Punt(8, -2);
        mijnCirkelArray[3] = new Cirkel(6, middelpuntCirkel3, "blauw");

        for (int arrayTeller = 0; arrayTeller < mijnCirkelArray.length; arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller].geefOmtrek());
            System.out.println(mijnCirkelArray[arrayTeller].geefOppervlakte());
        }
        mijnCirkelArray[0].setStraal(-3);

        Punt mijnPunt = new Punt(2, -5);
        System.out.println(mijnPunt.getxCoordinaat());

        Rechthoek rechthoek1 = new Rechthoek(4.6, 5.7);
        System.out.println();
    }
}

