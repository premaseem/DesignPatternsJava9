package com.premaseem.milkshake;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class StrawberryMilkShake implements MilkShake{
    String brand;
    Integer iceCubes;

    public StrawberryMilkShake(String brand, Integer iceCubes){
        this.brand = brand;
        this.iceCubes = iceCubes;
    }
    @Override
    public Integer getIceAmount () {
        return this.iceCubes;
    }

    @Override
    public String getBrand () {
        return this.brand;
    }
}
