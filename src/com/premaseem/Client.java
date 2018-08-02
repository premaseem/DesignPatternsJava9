package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("program to add number");
        Integer sum = calculateSum();
        System.out.println("total of all numbers is "+ sum);
    }

    private static Integer calculateSum () {
        Integer sum = 0;
        for (int i =0; i< 1000; i++){
            Calculator calc = Calculator.getInstance();
            sum = calc.add(sum,i);
        }
        return sum;
    }
}
