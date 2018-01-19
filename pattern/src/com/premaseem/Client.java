package com.premaseem;

import java.util.Scanner;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Client {
    public static void main (String[] args) throws CloneNotSupportedException {
        System.out.println("### Statue creation by Prototype design pattern ");
        System.out.println("How many Statue you want to create based on Mold / prototype ?");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();

        StatueMold statueMold = new GaneshStatue();

        for(int i=0;i<quantity;i++){
            statueMold.createStatue();
        }

    }
}
