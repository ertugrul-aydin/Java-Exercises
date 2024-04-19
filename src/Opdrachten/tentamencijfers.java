package Opdrachten;

import java.util.Scanner;

public class tentamencijfers {

    public static Double berekenGemiddeldeCijfers(Double[] getCijfersArray){

        int total = 0;
        for (Double cijfer : getCijfersArray) {
            total += cijfer;
        }
        return (double) total / getCijfersArray.length;
    }

    public static Integer berekenAantalVoldoendes(Double[] getCijfersArray, Double gemiddeldeCijfer){
        int volvoende = 0;

        for (Double cijfer : getCijfersArray) {
            if (gemiddeldeCijfer < cijfer){
                volvoende++;
            }
        }
        return volvoende;
    }

    public static Double vindGroetseCijfer(Double[] cijfersArray) {

        Double groetsteCijfer = cijfersArray[0];

        for (int i = 1; i < cijfersArray.length; i++) {
            if (cijfersArray[i] > groetsteCijfer){
                groetsteCijfer = cijfersArray[i];
            }

        }
        return groetsteCijfer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean doorgaan = true;

        do{
            System.out.println("Hoeveel cijfers wilt u invoeren?");
           int cijfers = sc.nextInt();

            if (cijfers == 0){
                System.out.println("Aantal cijfers moet groter zijn dan 0!?");
            }else{
                Double[] cijferStudents = new Double[cijfers];

                for (int i = 1; i <= cijferStudents.length; i++){
                    System.out.print("Cijfer student" + i + " : ");
                    cijferStudents[i-1] = sc.nextDouble();
                }

                int aantalCijfers = cijferStudents.length;
                Double gemiddeldeCijfer = berekenGemiddeldeCijfers(cijferStudents);
                int aantaalVoldoendes = berekenAantalVoldoendes(cijferStudents, gemiddeldeCijfer);
                Double Hoogstecijfer = vindGroetseCijfer(cijferStudents);

                System.out.println("Aantal cijfers : " + aantalCijfers);
                System.out.println("Gemiddelde cijfer: " + gemiddeldeCijfer);
                System.out.println("Aantal voldoendes: " + aantaalVoldoendes);
                System.out.println("Hoogste cijfer: " + Hoogstecijfer);

                doorgaan = false;
            }
        }while(doorgaan);
    }
}
