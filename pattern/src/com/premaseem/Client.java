package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Proxy iPhone example");

        // Programming against interface
        IPhone iPhone;

        // Loading proxy iPhone for selection purpose
        iPhone = new ProxyiPhone();
        phoneOperation(iPhone);

        iPhone = new RealiPhone();
        phoneOperation(iPhone);

    }

    public static void phoneOperation(IPhone iPhone){
        System.out.println();
        System.out.println("### Operations running on - "+ iPhone.getClass().getSimpleName());
        iPhone.getColor();
        iPhone.getDimension();
        iPhone.operateDisplay();
    }
}
