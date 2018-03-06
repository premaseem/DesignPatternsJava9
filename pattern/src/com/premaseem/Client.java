package com.premaseem;

import java.util.Scanner;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Light switch Project using COMMAND DESIGN PATTERN \n ");

       /** After implementing Command design pattern **/

       // All available Commands will be created and init by command factory
       CommandFactory cf = CommandFactory.init();

       // Will list all commands which can be executed
       cf.listCommands();

       // Commands can be added and listed dynamically with ZERO code changes in client side
       System.out.println("Master - what command you want to execute ");
       String command = scanInput.next();

       // Actual execution of command will happen
       cf.executeCommand(command);

        /** Lessons Learnt - AFTER CODE
         # New commands can be added dynamically with ease
         # Client is loosely coupled and have no knowledge of encapsulated commands
         # Zero code changed needed at client when new commands are added
         */


       /** BEFORE CODE
        // Assume you will invoke a method to execute turn on method
        if (command.equalsIgnoreCase("LightOn")){
            System.out.println("Light turned on");
        }
        else if (command.equalsIgnoreCase("LightOff")){
            System.out.println("Light turned off");
        }
        else {
            System.out.println(command+ " Command not found");
        }

        // Lessons Learnt - BEFORE CODE
        // Lots of if else ladder
        // Commands cannot be added Dynamically
        // Code is tightly coupled, no separation of responsibility
        */
    }
}
