package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class RealiPhone implements IPhone{
    @Override
    public void getColor () {
        System.out.println(this.getClass().getSimpleName() +" Colors: Gold, Rose Gold, Carbon Black");
    }

    @Override
    public void getDimension () {
        System.out.println(this.getClass().getSimpleName() + " Dimension: Normal and Plus");
    }

    @Override
    public void operateDisplay () {
        System.out.println(this.getClass().getSimpleName() +" Multi color display working in real Phone object :-) ");
    }
}
