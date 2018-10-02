package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class FactoryCreator {
        static AbstractIceCreamFactory getFactory (String brand) {
            if (brand.equalsIgnoreCase("Amul")){
                return new AmulIceCreamFactory();
            }else {
                return new DairyQueenCreamFactory();
            }
    }
}
