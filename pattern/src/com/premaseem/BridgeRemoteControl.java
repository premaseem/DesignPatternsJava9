package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public abstract class BridgeRemoteControl {

    // Introduced has a relationship
    private ITV tv;

    public BridgeRemoteControl (ITV tv) {
        this.tv = tv;
    }

    public void turnOn () {
        tv.on();
    }

    public void turnOff () {
        tv.off();
    }

    public void setChannel (int channel) {
        tv.switchProgram(channel);
    }

    // additional features
    public void recordProgram(){
        System.out.println("IndependentRemoteControl use keyword to set channel.");
    }
}


class IndependentRemoteControl extends BridgeRemoteControl {
    public IndependentRemoteControl (ITV tv) {
        super(tv);
    }

    public void setChannelKeyboard (int channel) {
        setChannel(channel);
        System.out.println("IndependentRemoteControl use keyword to set channel.");
    }


}

// coupled implementation of remote controller
class DependentRemoteControl implements ITV {
    @Override
    public void on () {
        System.out.println(" Forced to change, if TV interface changes ");
    }

    @Override
    public void off () {
        System.out.println(" Forced to change, if TV interface changes ");
    }

    @Override
    public void switchProgram (int channel) {
        System.out.println(" Forced to change, if TV interface changes ");
    }

}