package com.premaseem;

import com.premaseem.phones.GooglePhone;
import com.premaseem.phones.IPhone;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Client {
    public static void main (String[] args) {
        System.out.println("Adapter Design Pattern Example ");

        // Created instances of devices
        IPhone iPhone = new IPhone();
        GooglePhone googlePhone = new GooglePhone();
        EarPlug earPlug = new EarPlug();

        // Ear plug is able to take iPhone sound signal
        String soundSignal = iPhone.getSoundOutput();
        earPlug.takeSoundInput(soundSignal);

        // Ear plug is not able to take google phone sound signal
        Integer soundSignals = googlePhone.getSoundOutput();

        // Created adapter to convert signals expected by client
        EarPlugAdapter earPlugAdapter = new EarPlugAdapter();
        earPlug.takeSoundInput(earPlugAdapter.convertSoundSignal(soundSignals));

    }
}
