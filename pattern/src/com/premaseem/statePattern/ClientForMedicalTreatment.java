package com.premaseem.statePattern;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.Scanner;

public class ClientForMedicalTreatment {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String repeatRunFlag = "yes";

        System.out.println("This is State Pattern example where in treatment would be dependent on the state of the patient ) ");
        TreatmentContext context = new TreatmentContext();

        while (repeatRunFlag.equalsIgnoreCase("yes")) {
            // method takes patients state input
            takePatientStateInput(context);

            System.out.println("Patient's State is - " + context.getState().getClass().getSimpleName() + ". Choose line of treatment ...");
            System.out.println(" Press 1 for admitting in ICU");
            System.out.println(" Press 2 for prescribing general Medicine ");
            System.out.println(" Press 3 for supply of Oxygen");
            System.out.println(" Press 4 for supply of Normal food");
            System.out.println(" Press 5 for recommending a walk ");

            int treatmentType = scan.nextInt();

            switch (treatmentType) {
                case 1:
                    context.admitInICU();
                    break;
                case 2:
                    context.prescribeGeneralMedicine();
                    break;
                case 3:
                    context.supplyOxygen();
                    break;
                case 4:
                    context.supplyNormalFood();
                    break;

                case 5:
                    context.recommendWalking();
                    break;
            }

            System.out.println(" ## State changed to: " + context.getState().getClass().getSimpleName());
            System.out.println("Press yes for further treatment and No to EXIT .... ");
            try {
                repeatRunFlag = scan.next();
            } catch (Exception e) {
                repeatRunFlag = "No";
            }
        }
    }

    private static void takePatientStateInput (TreatmentContext context) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose state of patient before starting treatment ");
        System.out.println(" Press 1 for unstable state patient");
        System.out.println(" Press 2 for stable state patient ");
        int entType = scan.nextInt();

        switch (entType) {
            case 1:
                context.setState(context.unStablePatientState);
                break;
            case 2:
                context.setState(context.stablePatientState);
                break;
        }
    }
}
