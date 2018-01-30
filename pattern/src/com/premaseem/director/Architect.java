package com.premaseem.director;

import com.premaseem.builder.House;
import com.premaseem.builder.HouseBuilder;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

/* "Director" */
public class Architect {

    private HouseBuilder houseBuilder;

    public void setHouseBuilder (HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.addRooms();
        houseBuilder.addPlumbingSystem();
        houseBuilder.addAirConditionerSystem();
        houseBuilder.addSecuritySystem();
        houseBuilder.paintHouse("white");
    }

    public House getFinishedHouse(){
        return houseBuilder.getHouse();
    }
}
