package me.premaseem;

import me.premaseem.remotes.SetTopBoxRemote;
import me.premaseem.remotes.SoundSystemRemote;
import me.premaseem.remotes.TVRemote;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Master Remote Facade ");

        // Client is tightly coupled with sub systems
        TVRemote tvRemote = new TVRemote();
        SoundSystemRemote soundSystemRemote = new SoundSystemRemote();
        SetTopBoxRemote setTopBoxRemote = new SetTopBoxRemote();

        // Turning ON requires several calls
        tvRemote.trunOn();
        soundSystemRemote.trunOn();
        setTopBoxRemote.trunOn();

        // Turning OFF requires several calls
        tvRemote.trunOn();
        soundSystemRemote.trunOn();
        setTopBoxRemote.trunOn();
    }
}
