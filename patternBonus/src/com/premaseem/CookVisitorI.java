package com.premaseem;

public interface CookVisitorI {
	void cook (LoudParty loudParty);
	void cook (CalmParty calmParty);
}

class VegCookVisitor implements CookVisitorI{

	@Override
    public void cook(LoudParty loudParty) {
		loudParty.meal = "Spicy Vegetables";
		loudParty.drink = "Fruit Beer";
		loudParty.music = "Loud music";
		loudParty.getPartyDetail();
    }

	@Override
    public void cook(CalmParty calmParty) {
		calmParty.meal = "Boiled Vegetables";
		calmParty.drink = "Fruit Juice";
		calmParty.music = "Meditation Music";
		calmParty.getPartyDetail();
    }
}

class NonVegCookVisitor implements CookVisitorI{

	@Override
    public void cook(LoudParty loudParty) {
		loudParty.meal = "Spicy chicken";
		loudParty.drink = "Beer";
		loudParty.music = "High Beat music";
		loudParty.getPartyDetail();
    }

	@Override
    public void cook(CalmParty calmParty) {
		calmParty.meal = "Non spicy chicken";
		calmParty.drink = "Fruit Beer";
		calmParty.music = "Meditation music";
		calmParty.getPartyDetail();
    }
}