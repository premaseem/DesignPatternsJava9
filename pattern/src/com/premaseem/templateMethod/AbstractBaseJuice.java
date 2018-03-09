package com.premaseem.templateMethod;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public abstract class AbstractBaseJuice {

	/*
	 * This is template method which defines the sequence and steps for preparation.
	 */
	// Note: Sequence is important and should be modified by sub classes
	final public void prepare() {
		pickUpFruits();
		washFruits();
		pileFruits();
		cutFruits();
		addLiquid();
		operateJuicer();
		decorateJuiceHook();
	}

	// Variable methods would be implemented by sub classes
	abstract String getFruitName();

	abstract void pickUpFruits();

	abstract void addLiquid();

	// Reusable methods are defined in base class
	void washFruits() {
		System.out.println("Washing the fruit ... " + getFruitName());
	}

	void pileFruits() {
		System.out.println("piling the fruit  ... " + getFruitName());
	}

	void cutFruits() {
		System.out.println("cutting the fruit  ... " + getFruitName());
	}

	void operateJuicer() {
		System.out.println("... operate juicer Ghur Ghur Ghur  ... ");
	}

	void decorateJuiceHook() {
		System.out.println("add few dry fruits on top ");
	}
}

class AppleMilkJuice extends AbstractBaseJuice {

	@Override
	String getFruitName() {
		return " Apples ";
	}

	@Override
	void pickUpFruits() {
		System.out.println(getFruitName() + " is picked up for Juice preparation ");
	}

	@Override
	void addLiquid() {
		System.out.println("Add Milk in apple milk shake ");
	}
	
	void decorateJuiceHook() {
		System.out.println("decorate with Strawberry on top ");
	}
}

class OrangeJuice extends AbstractBaseJuice {
	@Override
	String getFruitName() {
		return " Orange ";
	}

	@Override
	void pickUpFruits() {
		System.out.println(getFruitName() + " is picked up for Juice prepration ");
	}

	@Override
	void addLiquid() {
		System.out.println("Add some water in Orange juice ");
	}
	
	void decorateJuiceHook() {
		System.out.println("decorate with lime slice and straw ");
	}
}

class MixFruitJuice extends AbstractBaseJuice {
	@Override
	String getFruitName() {
		return " Mixfruit ";
	}

	@Override
	void pickUpFruits() {
		System.out.println(getFruitName() + " is picked up for Juice preparation ");
	}

	@Override
	void addLiquid() {
		System.out.println("Adding some flavour  ");
	}
}
