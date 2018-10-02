package com.premaseem;

import com.premaseem.icecreams.IceCream;
import com.premaseem.milkshake.MilkShake;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public abstract class AbstractIceCreamFactory {
    abstract IceCream createIceCream(String choice);
    abstract MilkShake createMilkShake(String choice);

}
