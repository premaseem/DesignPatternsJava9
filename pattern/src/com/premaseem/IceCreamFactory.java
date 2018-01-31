package com.premaseem;

import com.premaseem.icecreams.ChocolateIceCream;
import com.premaseem.icecreams.IceCream;
import com.premaseem.icecreams.StrawberryIceCream;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public class IceCreamFactory {

    static public IceCream createIceCream(String iceCreamChoice){
        IceCream iceCream = null;

        if (iceCreamChoice.equalsIgnoreCase("Strawberry")){
            iceCream = new StrawberryIceCream(2,120);

        }else if (iceCreamChoice.equalsIgnoreCase("Chocolate")){
            iceCream = new ChocolateIceCream(2,250);
        }

        return iceCream;
    }
}
