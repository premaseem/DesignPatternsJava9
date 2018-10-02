package com.premaseem.abstractFactory;

public interface Pizza {
	void getDescription();

	double getCost();
}

class VegPizza implements Pizza {
	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		System.out.println(" Veg Pizza from general Factory");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 10.1;
	}
}

class JainVegPizza implements Pizza {
	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		System.out.println(" Veg Pizza from Jain Factory");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 11.1;
	}
}

class CornPizza implements Pizza {
	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		System.out.println(" Corn Pizza from general Factory");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 20.1;
	}
}

class JainCornPizza implements Pizza {
	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		System.out.println(" Corn Pizza from Jain Factory");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 22.1;
	}
}
