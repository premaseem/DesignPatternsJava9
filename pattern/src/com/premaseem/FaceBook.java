package com.premaseem;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class FaceBook {

    List<String> friendsList = new ArrayList<>();

    public FaceBook () {
        // initialize with seed data
        friendsList.add("Aseem Jain");
        friendsList.add("James Bond");
        friendsList.add("Spider Man");
        friendsList.add("Super Man");
    }

//    public List<String> getFriendsList () {
//        return friendsList;
//    }

    public Iterator getIterator() {
        return new Iterator(this);
    }
}

class Iterator {
    private FaceBook faceBook;
    private java.util.Iterator iterator;
    private String value;

    public Iterator(FaceBook faceBook) {
        this.faceBook = faceBook;
    }

    public void first() {
        iterator = faceBook.friendsList.iterator();
        next();
    }

    public void next() {
        try {
            value = (String)iterator.next();
        } catch (NoSuchElementException ex) {
            value =  null;
        }
    }

    public boolean hasNext() {
        return value != null;
    }

    public String currentValue() {
        return value;
    }
}