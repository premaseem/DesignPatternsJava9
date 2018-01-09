package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Calculator {
    static int num = 0;
    private static Calculator instance = null;

    public static Calculator getInstance(){
        if (instance == null){
            instance = new Calculator();
        }
        return instance;
    }

    private Calculator () {
        num++;
        System.out.println(num + " wasting memory with new object");
    }

    public Integer add (Integer sum, Integer number) {
        return sum + number;
    }
}
