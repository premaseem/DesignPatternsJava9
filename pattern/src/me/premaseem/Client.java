package me.premaseem;

import me.premaseem.remotes.MasterRemoteFacade;
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

        // decoupled systems from client and moved to facade
        MasterRemoteFacade masterRemoteFacade = new MasterRemoteFacade();

        // Facade simplified code and reduced complexity
        masterRemoteFacade.turnOn();
        masterRemoteFacade.turnOFF();

//        // Turning ON requires several calls
//        tvRemote.trunOn();
//        soundSystemRemote.trunOn();
//        setTopBoxRemote.trunOn();
//
//        // Turning OFF requires several calls
//        tvRemote.trunOn();
//        soundSystemRemote.trunOn();
//        setTopBoxRemote.trunOn();
    }
}
