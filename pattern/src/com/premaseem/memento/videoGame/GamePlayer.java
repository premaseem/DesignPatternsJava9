package com.premaseem.memento.videoGame;
/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public class GamePlayer implements Cloneable  {

	String playerName;
	String maskPicked="premAseem";
	Integer level=1;
	Integer totalPoints=100;

	String getPlayerName() {
		return playerName;
	}

	void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	String getMaskPicked() {
		return maskPicked;
	}

	void setMaskPicked(String maskPicked) {
		this.maskPicked = maskPicked;
	}

	Integer getLevel() {
		return level;
	}

	void setLevel(Integer level) {
		this.level = level;
	}

	Integer getTotalPoints() {
		return totalPoints;
	}

	void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	void increase100Points(){
		totalPoints+=100;
		level+=1;
	}

	
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
    }

	@Override
    public String toString() {
	    System.out.printf(" name: %s - Mask: %s - Level: %d - Points : %d ",playerName,maskPicked,level,totalPoints); 
		return super.toString();
    }
	
	

}
