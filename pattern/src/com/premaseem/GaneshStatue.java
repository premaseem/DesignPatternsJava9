package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class GaneshStatue implements StatueMold, Cloneable{

    @Override
    public void createStatue ()  {
        try {
            Object obj = this.clone();
            System.out.println("created statue object with id"+ obj.hashCode());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
