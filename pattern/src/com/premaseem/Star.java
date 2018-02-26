package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Star {

     String brightness;

    public Star (String brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString () {
        return "Star with brightness :" + brightness;
    }
}
