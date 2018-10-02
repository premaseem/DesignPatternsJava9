package com.premaseem;

import java.util.HashMap;
import java.util.Map;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/

*/
public class Client {
    public static void main (String[] args) {
        System.out.println(" Composite Design Pattern Organizational Tree");

        // Treating all employees in uniform way ( no discrimination )
        Employee CTO = new Employee("Aseem",1);

        Employee level_1_1 = new Employee("Kinesh",2);
        Employee level_1_2 = new Employee("Karteek",3);
        Employee level_1_3 = new Employee("Ash",4);

        Employee level_2_1 = new Employee("Amy",5);
        Employee level_2_2 = new Employee("Courty",6);
        Employee level_2_3 = new Employee("Jackson",7);
        Employee level_2_4 = new Employee("Leticia",8);

        Employee level_3_1 = new Employee("Peter",9);
        Employee level_3_2 = new Employee("Jodi",10);
        Employee level_3_3 = new Employee("William",11);
        Employee level_3_4 = new Employee("Darly",12);

        // Using tree structure in natural way with Leaf and branch
        CTO.addSubordinate(level_1_1);
        CTO.addSubordinate(level_1_2);
        CTO.addSubordinate(level_1_3);

        // adding level 1 subordinates in tree
        level_1_1.addSubordinate(level_2_1);
        level_1_1.addSubordinate(level_2_2);

        level_1_2.addSubordinate(level_2_3);
        level_1_2.addSubordinate(level_2_4);

        // adding level 2 subordinates in tree
        level_2_2.addSubordinate(level_3_1);
        level_2_2.addSubordinate(level_3_2);

        level_2_3.addSubordinate(level_3_3);
        level_2_3.addSubordinate(level_3_4);

        // Manager details
        System.out.println("Details of Leaf - Non Manager");
        level_2_2.showEmployeeDetails();


        // Non Manager details
        System.out.println("Details of Branch - Manager");
        level_3_1.showEmployeeDetails();

        System.out.println("Details of full tree / entire organization ");
        CTO.showEmployeeDetails();



        /* OLD discarded code */

//        ManagerEmployee managerEmployee = new ManagerEmployee("Aseem");
//        ManagerEmployee managerEmployee1 = new ManagerEmployee("Kinesh");
//        ManagerEmployee managerEmployee2 = new ManagerEmployee("Karteek");
//
//        NonManagerEmployee nonManagerEmployee1 = new NonManagerEmployee("Ash");
//        NonManagerEmployee nonManagerEmployee2 = new NonManagerEmployee("Amy");
//
//        Map managerEmployees = new HashMap();
//        // Manager can have another manager under him
//        managerEmployees.put(managerEmployee,managerEmployee1);
//        // Manager can have non manager under him
//        managerEmployees.put(managerEmployee,nonManagerEmployee1);
//        managerEmployees.put(managerEmployee,nonManagerEmployee2);
//        managerEmployees.put(managerEmployee1,managerEmployee2);
//
//        System.out.println(managerEmployees);

    }
}
