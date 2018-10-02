package com.premaseem.commandPattern;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public interface Device {
    void turnOFF();
}


// There are several 3rd component or devices. They would ack as reciever of the command. Each command object would wrap them.
class Light implements Device {
    void turnON() {
        System.out.println("Turn ON Light");
    }

    public void turnOFF() {
        System.out.println("Turn OFF Light");
    }
}

class Fan implements Device {

    public enum speed{
        OFF,LOW,MED,HIGH
    }
    speed fanSpeed;

    public void turnOFF() {
        fanSpeed = speed.OFF;
        System.out.println("Turn OFF FAN");
    }
    void turnLOW() {
        fanSpeed = speed.LOW;
        System.out.println("Turn OFF FAN");
    }
    void turnMED() {
        fanSpeed = speed.MED;
        System.out.println("Turn OFF FAN");
    }
    void turnHIGH() {
        fanSpeed = speed.HIGH;
        System.out.println("Turn OFF FAN");
    }

}

class TV implements Device {
    void turnON() {
        System.out.println("Turn ON TV");
    }

    public void turnOFF () {
        System.out.println("Turn OFF TV");
    }
    void channelUP() {
        System.out.println("Channel UP TV");
    }

    void channelDOWN() {
        System.out.println("Channel Down TV");
    }

}

class MusicSystem implements Device {
    void turnON() {
        System.out.println("Turn ON Music System");
    }

    public void turnOFF () {
        System.out.println("Turn OFF Music System");
    }
    void volumeUP() {
        System.out.println("Volume up Music System");
    }

    void volumeDOWN() {
        System.out.println("Volume down Music System");
    }
}
