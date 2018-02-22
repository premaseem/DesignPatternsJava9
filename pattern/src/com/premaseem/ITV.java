package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public interface ITV {
    public void on ();

    public void off ();

    public void switchChannel (int channel);
}

class SamsungTV implements ITV {
    @Override
    public void on () {
        System.out.println("Samsung is turned on.");
    }

    @Override
    public void off () {
        System.out.println("Samsung is turned off.");
    }

    @Override
    public void switchChannel (int channel) {
        System.out.println("Samsung: channel - " + channel);
    }
}

class SonyTV implements ITV {

    @Override
    public void on () {
        System.out.println("Sony is turned on.");
    }

    @Override
    public void off () {
        System.out.println("Sony is turned off.");
    }

    @Override
    public void switchChannel (int channel) {
        System.out.println("Sony: channel - " + channel);
    }
}