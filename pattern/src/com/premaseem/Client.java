package com.premaseem;

import java.util.List;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Iterator Pattern BEFORE CODE");

        FaceBook faceBook = new FaceBook();

        // Data structure is exposed
        List<String> friendsList = faceBook.getFriendsList();

        // print friends with normal conventional loop
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.println(friendsList.get(i));
        }

        // Un intentional addition of data
        friendsList.add("Lady gaga");

        // print friends with normal conventional loop
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.println(friendsList.get(i));
        }

        // Clients can accidentally or maliciously trash data structure.
        friendsList.clear();

        // print friends with normal conventional loop
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.println(friendsList.get(i));
        }

        // Lesson Learned
        // 1. Underlying Data structure is exposed
        // 2. Data can be manipulated
        // 3. Data can be get trashed accidentally
        // 4. Data traversal is not easy or uniform
    }
}
