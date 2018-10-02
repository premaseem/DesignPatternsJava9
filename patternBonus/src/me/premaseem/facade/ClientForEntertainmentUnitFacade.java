package me.premaseem.facade;

import java.util.Scanner;

public class ClientForEntertainmentUnitFacade {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;


        System.out.println("This is Facade Pattern example which provides a simple interface " +
                "for the client to play a movie me entertainment unit " +
                "(simplifies the setup process of entertainment unit) ");

        EntertainmentFacade entertainmentFacade = new EntertainmentFacade();
        while (repeatRunFlag == 1) {
            System.out.println("What would you like to do with your entertainment unit today ");
            System.out.println(" Press 1 for movie");
            System.out.println(" Press 2 for music");
            System.out.println(" Press 3 for game ");
            int entType = scan.nextInt();
            System.out.println("Please enter the name ");
            String name = scan.next();


            switch (entType) {
                case 1:
                    entertainmentFacade.playMovie(name);
                    break;
                case 2:
                    entertainmentFacade.playMusic(name);
                    break;
                case 3:
                    entertainmentFacade.playGame(name);
                    break;
            }

            System.out.println("Press 1 for more entertainment and 0 for EXIT .... ");
            try {
                repeatRunFlag = scan.nextInt();
            } catch (Exception e) {
                repeatRunFlag = 0;
            } finally {
                entertainmentFacade.masterPowerOff();
            }

        }
    }
}
