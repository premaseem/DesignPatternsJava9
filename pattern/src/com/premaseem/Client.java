package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Singleton cook example ");
        Cook cook1 = Cook.getInstance();
        Cook cook2 = Cook.getInstance();
        Cook cook3 = Cook.getInstance();

        cook1.makeBroth();
        cook2.makeBroth();
        cook3.makeBroth();

    }
}
