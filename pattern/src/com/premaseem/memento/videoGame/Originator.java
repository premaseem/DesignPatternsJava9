package com.premaseem.memento.videoGame;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public class Originator {
	GamePlayer player;

	Memento saveMemento(GamePlayer player){
		GamePlayer playerSnapShot = createPlayerSnapshot(player);
		Memento memento = new Memento(playerSnapShot);
		return memento;
	}

	private GamePlayer createPlayerSnapshot(GamePlayer player) {
		GamePlayer playerSnapShot=null;
		try {
			playerSnapShot = (GamePlayer) player.clone();
        } catch (CloneNotSupportedException e) {

	        e.printStackTrace();
        }
		
		return playerSnapShot;
    }
	
	 void restorePlayerSnapshot(GamePlayer playerSnapShot,GamePlayer player) {
	    playerSnapShot.setMaskPicked(player.getMaskPicked());
	    playerSnapShot.setLevel(player.getLevel());
	    playerSnapShot.setTotalPoints(player.getTotalPoints());
	    playerSnapShot.setPlayerName(player.getPlayerName());
    }
}