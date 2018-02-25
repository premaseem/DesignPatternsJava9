package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class NonManagerEmployee {
    private String name;

    public NonManagerEmployee (String name) {

        this.name = name;
    }

    @Override
    public String toString () {
        return "NonManagerEmployee{" +
                "name='" + name + '\'' +
                '}';
    }
}

