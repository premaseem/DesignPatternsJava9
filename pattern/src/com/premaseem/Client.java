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
        System.out.println("Command Pattern Light switch project ");
        System.out.println("Master - what command you want to execute ");
        String command = scanInput.next();

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
    }
}
