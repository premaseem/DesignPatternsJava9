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

        ManagerEmployee managerEmployee = new ManagerEmployee("Aseem");
        ManagerEmployee managerEmployee1 = new ManagerEmployee("Kinesh");
        ManagerEmployee managerEmployee2 = new ManagerEmployee("Karteek");

        NonManagerEmployee nonManagerEmployee1 = new NonManagerEmployee("Ash");
        NonManagerEmployee nonManagerEmployee2 = new NonManagerEmployee("Amy");

        Map managerEmployees = new HashMap();
        managerEmployees.put(managerEmployee,managerEmployee1);
        managerEmployees.put(managerEmployee1,managerEmployee2);
        managerEmployees.put(managerEmployee,nonManagerEmployee1);
        managerEmployees.put(managerEmployee,nonManagerEmployee2);

        System.out.println(managerEmployees);

    }
}
