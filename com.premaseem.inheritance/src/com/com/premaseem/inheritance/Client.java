
package com.com.premaseem.inheritance;

import com.com.premaseem.inheritance.model.Developer;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Client {
    public static void main (String[] args) {
        Developer employee1 = new Developer("Aseem",
                20,100);
        System.out.println("Inheritence concept");
        System.out.println(employee1);
    }

}
