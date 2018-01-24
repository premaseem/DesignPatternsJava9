package com.premaseem.room;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Room {

     private Integer numberOfWindows = 1;
     private Integer numberOfWalls = 4;


    public Integer getNumberOfWindows () {
        return numberOfWindows;
    }

    public void setNumberOfWindows (Integer numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public Integer getNumberOfWalls () {
        return numberOfWalls;
    }

    public void setNumberOfWalls (Integer numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }
}

