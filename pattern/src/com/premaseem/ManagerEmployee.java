package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class ManagerEmployee {


    private String empName;

    public ManagerEmployee (String empName) {

        this.empName = empName;
    }

    @Override
    public String toString () {
        return "ManagerEmployee{" +
                "empName='" + empName + '\'' +
                '}';
    }
}
