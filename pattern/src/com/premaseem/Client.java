package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Bridge cook example ");
        ITV tv = new SonyTV();
        // DependentRemoteControl sub classes TV interface
        // and is forced to change even with minor changes in TV interface
        DependentRemoteControl remote = new DependentRemoteControl();
        remote.on();
        remote.switchProgram(23);
    }
}
