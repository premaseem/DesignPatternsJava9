package com.premaseem;

public abstract class Party {

	String music = " No Music";
	String meal = " empty";
	String drink = "plane water ";
	CookVisitorI visitor = null;

	abstract void accept(CookVisitorI visitor);


	String getPartyDetail() {
		String detials = visitor!= null ?visitor.getClass().getSimpleName() : "in house cooking"  + " organized " + this.getClass().getSimpleName() + " has Music : " + music + " with Drink :"
		        + drink + " & Meal : " + meal;
		System.out.println(detials);
		return detials;
	}
	
    public void cookInHouse() {
		meal = "Spicy Vegetables";
		drink = "in house drink";
		music = "DJ music";
		getPartyDetail();	    
    }

}

class LoudParty extends Party {

	@Override
	void accept(CookVisitorI visitor) {
		this.visitor = visitor;
		visitor.cook(this);
	}
}

class CalmParty extends Party {

	@Override
	void accept(CookVisitorI visitor) {
		this.visitor = visitor;
		visitor.cook(this);
	}
}

