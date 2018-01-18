package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Cook {

    private Cook(){

    }

    private static Cook uniqueInstance = null;

    public static Cook getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new Cook();
        }
        return uniqueInstance;
    }
    boolean saltAdded = false;

    public void makeBroth(){
        if(!saltAdded){
            System.out.println("adding salt");
            saltAdded = true;
        }
    }

}
