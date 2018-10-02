package com.premaseem.ambulanceBuilder;

public class AmbulanceBuilder {

	Ambulance buildAmbulance(int numberOfWheel, String label){
		Ambulance ambulance=new Ambulance();
		VanFactory vanFactory = new VanFactory();
		ambulance.setVan(vanFactory.getVan(numberOfWheel));
		ambulance.setLabel(label);
		return ambulance;
	}
}

class Ambulance{
	Van van;
	String label;
	
	Van getVan() {
		return van;
	}
	void setVan(Van van) {
		this.van = van;
	}
	String getLabel() {
		return label;
	}
	void setLabel(String label) {
		this.label = label;
	}

	
	@Override
    public String toString() {
	    return "Ambulance for " + label + " with number of wheels " + van.noOfWheels;
    }
	
	
}