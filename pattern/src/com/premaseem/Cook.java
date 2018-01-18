package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Cook {

    public Cook(){

    }

    boolean saltAdded = false;

    public void makeBroth(){
        if(!saltAdded){
            System.out.println("adding salt");
            saltAdded = true;
        }
    }

}
