package com.premaseem.ambulanceBuilder;

public class VanFactory {

	// factory method
	Van createVan(int noOfWheel) {
		Van van = new Van();
		van.noOfWheels = noOfWheel;
		return van;
	}

	// simple factory
	Van getVan(int noOfWheel) {

		switch (noOfWheel) {
		case 1:
			return new FourWheelerVan();
		case 2:
			return new FourWheelerVan();
		default:
			return new EightWheelerVan();
		}

	}

}





class Van {
	int noOfWheels;
}

class SixWheelerVan extends Van {
	public SixWheelerVan() {
		noOfWheels = 6;
	}
}

class FourWheelerVan extends Van {
	public FourWheelerVan() {
		noOfWheels = 4;
	}
}

class EightWheelerVan extends Van {
	public EightWheelerVan() {
		noOfWheels = 8;
	}
}
