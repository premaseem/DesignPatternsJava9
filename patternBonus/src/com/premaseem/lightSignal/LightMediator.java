package com.premaseem.lightSignal;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.ArrayList;
import java.util.List;

public class LightMediator {

    List<Light> list = new ArrayList<Light>();

    public void registerLight(Light lite) {
        int index = list.size();
        lite.addId(index);
        list.add(index, lite);

    }

    void turnOffAllOtherLights(int ind){
        for (Light litt :   list){
            if(!(litt.id==ind)){
                litt.turnOFF();
            }
        }
    }

    public void turnON(Light light) {
        turnOffAllOtherLights(light.id);
    }
}
