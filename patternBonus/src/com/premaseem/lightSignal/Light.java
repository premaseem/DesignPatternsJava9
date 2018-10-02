package com.premaseem.lightSignal;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public abstract class Light {
    Light(LightMediator LightMediator){
        this.LightMediator = LightMediator;
        LightMediator.registerLight(this);
    }
    enum state {
        ON, OFF
    }

    state currentState;
    LightMediator LightMediator;
    int id;

    void turnON() {
        currentState = state.ON;
        System.out.printf("%s is turned %s \n", this.getClass().getSimpleName(), currentState.ON);
        LightMediator.turnON(this);
    }

    void turnOFF() {
        currentState = state.OFF;
        System.out.printf("%s is turned %s \n", this.getClass().getSimpleName(), currentState.OFF);
    }

    public void addId(int index) {
        id = index;
    }
}

class RedLight extends Light {
    public RedLight(LightMediator LightMediator) {
        super(LightMediator);
    }
}

class YellowLight extends Light {
    public YellowLight(LightMediator LightMediator) {
        super(LightMediator);
    }
}

class GreenLight extends Light {
    public GreenLight(LightMediator LightMediator) {
        super(LightMediator);
    }
}
