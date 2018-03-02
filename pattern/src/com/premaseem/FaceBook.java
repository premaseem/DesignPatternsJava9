package com.premaseem;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> getFriendsList () {
        return friendsList;
    }
}
