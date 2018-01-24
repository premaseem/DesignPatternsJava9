package com.premaseem.builder;

import com.premaseem.room.BathRoom;
import com.premaseem.room.BedRoom;
import com.premaseem.room.LivingRoom;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

/* "ConcreteBuilder" */
public class OneBedroomHouseBuilder extends HouseBuilder{

    @Override
    public void addRooms () {
        getHouse().rooms.add(new BathRoom());
        getHouse().rooms.add(new BedRoom());
        getHouse().rooms.add(new LivingRoom());
    }
}
