package com.premaseem;

import java.util.Scanner;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class ClientStudent {
    public static void main (String[] args) {
        System.out.println();
        System.out.println("University Lecture application designed using Visitor design pattern \n");
        System.out.println("Subject available for lectures are:-");
        System.out.println("Maths");
        System.out.println("Computers");
        System.out.println("Aviation");
        System.out.println();
        System.out.println("Please pick subject ...");

        Scanner scanner = new Scanner(System.in);
        String subjectOption = scanner.next();
        if (subjectOption.equalsIgnoreCase("Maths")){
            System.out.println("Math can be taught by in house Faculty");
            Subject subject = new Maths();
            subject.teach();
        }

        if (subjectOption.equalsIgnoreCase("Computers")){
            System.out.println("Computers needs visiting Faculty, lets call Prof. Prem Aseem Jain :-)");
            Subject subject = new Computer();
            VisitingFaculty profAseem = new ProfAseem();
            subject.acceptVisitingFacultytoTeach(profAseem);
        }

        if (subjectOption.equalsIgnoreCase("Aviation")){
            System.out.println("Aviation needs visiting Faculty, lets call Prof. Prem Aseem Jain :-)");
            Subject subject = new Aviation();
            VisitingFaculty profAseem = new ProfAseem();
            subject.acceptVisitingFacultytoTeach(profAseem);
        }

        System.out.println("Class over - Go Home and have fun :-) ");

    }
}
