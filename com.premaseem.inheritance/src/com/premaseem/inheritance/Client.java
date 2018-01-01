/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/

package com.premaseem.inheritance;

import com.premaseem.inheritance.model.Developer;
import com.premaseem.inheritance.model.Hr;
import com.premaseem.inheritance.model.QE;


public class Client {
    public static void main (String[] args) {
        Developer employee1 = new Developer("Aseem", 20,100);
        QE employee2 = new QE("Aseem", 20,100);
        Hr employee3 = new Hr("Sony",1000,10);

        System.out.println("Inheritance concept");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }

}
