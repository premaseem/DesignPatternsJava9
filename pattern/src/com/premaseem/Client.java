package com.premaseem;

import java.util.Scanner;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Strategy Design pattern - Mountaineering app ");
        System.out.println("Lets decide the strategy to cross mountain crevasse ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance of crevasse ...");
        int distance = scanner.nextInt();

        Context context = new Context();
        CrevasseCrossingStrategy crossingStrategy = context.getCrevasseCrossingStrategy(distance);
        System.out.println("Using Strategy : "+ crossingStrategy.getClass().getSimpleName());
        crossingStrategy.crossCrevasse();

    }
}
