package com.premaseem.builder;

import com.premaseem.room.Room;

import java.util.ArrayList;
import java.util.List;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
/* "Product" */
public class House {
    List<Room> rooms = new ArrayList<>();
    private String exteriorColor = "while";

    public String getExteriorColor () {
        return exteriorColor;
    }

    public void setExteriorColor (String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    @Override
    public String toString () {
        System.out.println("house has total rooms " + rooms.size());
        System.out.println("house has color " + getExteriorColor());
        return "";
    }
}
