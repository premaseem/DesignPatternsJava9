package com.premaseem;

import com.premaseem.icecreams.ChocolateIceCream;
import com.premaseem.icecreams.IceCream;
import com.premaseem.icecreams.StrawberryIceCream;
import com.premaseem.milkshake.ChocolateMilkShake;
import com.premaseem.milkshake.MilkShake;
import com.premaseem.milkshake.StrawberryMilkShake;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

/**
 * This factory creates all daily products of Amul Brand
 */
public class AmulIceCreamFactory extends AbstractIceCreamFactory{

    @Override
    public IceCream createIceCream(String iceCreamChoice){
        IceCream iceCream = null;

        if (iceCreamChoice.equalsIgnoreCase("Strawberry")){
            iceCream = new StrawberryIceCream("Amul",2,120);

        }else if (iceCreamChoice.equalsIgnoreCase("Chocolate")){
            iceCream = new ChocolateIceCream("Amul",2,250);
        }

        return iceCream;
    }

    @Override
    MilkShake createMilkShake (String choice) {
        MilkShake milkShake = null;

        if (choice.equalsIgnoreCase("Strawberry")){
            milkShake = new StrawberryMilkShake("Amul",2);

        }else if (choice.equalsIgnoreCase("Chocolate")){
            milkShake = new ChocolateMilkShake("Amul",2);
        }
        return milkShake;
    }
}
