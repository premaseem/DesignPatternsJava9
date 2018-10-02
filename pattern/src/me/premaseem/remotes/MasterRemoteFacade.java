package me.premaseem.remotes;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class MasterRemoteFacade {

    // sub system is de coupled from client
    private TVRemote tvRemote;
    private SoundSystemRemote soundSystemRemote;
    private SetTopBoxRemote setTopBoxRemote;

    public MasterRemoteFacade(){
         tvRemote = new TVRemote();
         soundSystemRemote = new SoundSystemRemote();
         setTopBoxRemote = new SetTopBoxRemote();
    }

    // Master turn on takes care of all sub systems
    public void turnOn(){
        System.out.println();
        System.out.println("Turning ON all sub systems");
        tvRemote.trunOn();
        soundSystemRemote.trunOn();
        setTopBoxRemote.trunOn();
    }

    // Master turn off takes care of all sub systems
    public void turnOFF(){
        System.out.println();
        System.out.println("Turning OFF all sub systems");
        tvRemote.trunOff();
        soundSystemRemote.trunOff();
        setTopBoxRemote.trunOff();
    }
}
